package com.example.service;

import com.example.entity.*;
import com.example.repository.InvoiceRepository;
import com.example.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Transactional
@Service
public class StockService {
    @Autowired
    private StockRepository stockRepository;

    @Autowired
    private InvoiceRepository invoiceRepository;

    public void insert(Stock stock) {
        Iterable<Stock>  stockList = stockRepository.findAll();
        if(!stock.getProduct().isTraceable()){
            Stock finalStock = stock;
            Optional<Stock> result = StreamSupport.stream(stockList.spliterator(), false).filter(x-> x.getProduct().getProductId()== finalStock.getProduct().getProductId()).findFirst();
            if(result.isPresent()){
                int existingQuantity = result.get().getQuantity();
                result.get().setQuantity(existingQuantity+stock.getQuantity());
                stock = result.get();
            }
        }

        stockRepository.save(stock);
    }

    public Optional<Stock> findById(int id) {
        return stockRepository.findById(id);
    }

    public Iterable<Stock> findAll() {
        return stockRepository.findAll();
    }

    public void updateStock(Stock stock) {
        stockRepository.save(stock);
    }

    public void deleteStock(Stock stock) {
        stockRepository.delete(stock);
    }
  public void updateStocks(Invoice invoiceReq) {
//      Iterable<Stock>  stockList = stockRepository.findAll();
//       List<Stock> warehouseStock = StreamSupport.stream(stockList.spliterator(), false).filter(x-> x.getWarehouse().getWarehouseId()== billing.getWarehouseId()).collect(Collectors.toList());
//      List<Stock> finalWarehouseStock = warehouseStock;
//      for(BillingItems billingItems : billing.getBillingItemsList()){
//          if(billingItems.isTraceable())
//          finalWarehouseStock.stream().filter(x->x.getLotId()==billingItems.getLotId()).map(y->{
//               y.setQuantity(y.getQuantity()-billingItems.getQuantity());
//               stockRepository.save(y);
//              return null;
//          }).findFirst();
//          else
//          {
//              finalWarehouseStock.stream().filter(x->x.getProduct().getProductId()==billingItems.getProductId()).map(y->{
//                  y.setQuantity(y.getQuantity()-billingItems.getQuantity());
//                  stockRepository.save(y);
//                  return null;
//              }).findFirst();
//          }
//      }
      Iterable<Stock>  stockList = stockRepository.findAll();
      Optional<Invoice> invoice = invoiceRepository.findById(invoiceReq.getInvoiceId());
      List<Stock> warehouseStock = StreamSupport.stream(stockList.spliterator(), false).filter(x-> x.getWarehouse().getWarehouseId()== invoice.get().getWarehouseId()).collect(Collectors.toList());
      List<Stock> finalWarehouseStock = warehouseStock;
      for(InvoiceItem invoiceItem : invoice.get().getInvoiceItem()){
          if(invoiceItem.isTraceable())
              finalWarehouseStock.stream().filter(x->x.getLotId()==invoiceItem.getLotId()).map(y->{
                  y.setQuantity(y.getQuantity()-invoiceItem.getQuantity());
                  stockRepository.save(y);
                  return null;
              }).findFirst();
          else
          {
              finalWarehouseStock.stream().filter(x->x.getProduct().getProductId()==invoiceItem.getProductId()).map(y->{
                  y.setQuantity(y.getQuantity()-invoiceItem.getQuantity());
                  stockRepository.save(y);
                  return null;
              }).findFirst();
          }
      }
    }



}
