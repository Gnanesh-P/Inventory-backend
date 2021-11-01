package com.example.entity;

import lombok.Data;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


@Entity
@Data
@NamedQuery(name="Product.findAll", query="SELECT p FROM Product p")
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int productId;

	private int productCode;

	private double productBuyingPrice;

	private String productName;

	private double productSellingPrice;

	private boolean isTraceable;

	@ManyToOne
	@JoinColumn(name="categoryId")
	private Category category;

	private Product product;

	private boolean traceable;

//	@OneToMany(mappedBy="product")
//	private List<Stock> stocks;

//	public List<Stock> getStocks() {
//		return this.stocks;
//	}
//
//	public void setStocks(List<Stock> stocks) {
//		this.stocks = stocks;
//	}
//
//	public Stock addStock(Stock stock) {
//		getStocks().add(stock);
//		stock.setProduct(this);
//
//		return stock;
//	}
//
//	public Stock removeStock(Stock stock) {
//		getStocks().remove(stock);
//		stock.setProduct(null);
//
//		return stock;
//	}

}