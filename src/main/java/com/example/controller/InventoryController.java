package com.example.controller;

import com.example.entity.Invoice;
import com.example.entity.Stock;
import com.example.entity.TheLogConverter;
import com.example.service.StockLogService;
import com.example.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.Optional;

@RestController
@RequestMapping("/stocks")
public class InventoryController {
    @Autowired
    private StockService stockService;
    @Autowired
    private StockLogService stockLogService;

    @RequestMapping("")
    public Iterable<Stock> getAllStock() {
        return stockService.findAll();
    }

    @RequestMapping("/{id}")
    public Optional<Stock> searchStock(@PathVariable int id) {
        return stockService.findById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "")
    public Stock addStock(@RequestBody Stock stock) {
       return  stockService.insert(stock);
//        stockLogService.insert(TheLogConverter.stockLogConverter(stock));
    }

    @RequestMapping(method = RequestMethod.PUT,value ="/{id}")
    public void updateStock(@RequestBody Stock stock) {
        stockService.updateStock(stock);
        stockLogService.insert(TheLogConverter.stockLogConverter(stock));
    }

    @RequestMapping(method = RequestMethod.DELETE,value ="/{id}")
    public void deleteStock(@RequestBody Stock stock) {
        stockService.deleteStock(stock);
        stockLogService.insert(TheLogConverter.stockLogConverter(stock));
    }
    @PostMapping("/updateStocks")
    public void updateStocks(@RequestBody Invoice invoice){
        stockService.updateStocks(invoice);
    }

}
