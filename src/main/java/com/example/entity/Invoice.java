package com.example.entity;

import lombok.Data;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


@Entity
@Data
@NamedQuery(name="Invoice.findAll", query="SELECT i FROM Invoice i")
public class Invoice implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int invoiceId;

	@ManyToOne
	@JoinColumn(name = "customerCode")
	private Customer customer;

	private double totalPrice;

	private Date invoiceDate;

	private int warehouseId;

	@OneToMany(cascade = CascadeType.ALL,
			targetEntity = InvoiceItem.class)
	@JoinColumn(name="cp_fk",referencedColumnName = "invoiceId" )
	private List<InvoiceItem> invoiceItem;
	public Invoice() {

	}
//
//	public int getInvoiceId() {
//		return this.invoiceId;
//	}
//
//	public void setInvoiceId(int invoiceId) {
//		this.invoiceId = invoiceId;
//	}
//
//	public double getLineTotal() {
//		return this.lineTotal;
//	}
//
//	public void setLineTotal(double lineTotal) {
//		this.lineTotal = lineTotal;
//	}
//
//	public int getProductId() {
//		return this.productId;
//	}
//
//	public void setProductId(int productId) {
//		this.productId = productId;
//	}
//
//	public String getProductName() {
//		return this.productName;
//	}
//
//	public void setProductName(String productName) {
//		this.productName = productName;
//	}
//
//	public double getQuantity() {
//		return this.quantity;
//	}
//
//	public void setQuantity(double quantity) {
//		this.quantity = quantity;
//	}
//
//	public double getTotal() {
//		return this.total;
//	}
//
//	public void setTotal(double total) {
//		this.total = total;
//	}
//
//	public BigDecimal getVersion() {
//		return this.version;
//	}
//
//	public void setVersion(BigDecimal version) {
//		this.version = version;
//	}
//
//	public List<ProductInvoice> getProductInvoices() {
//		return this.productInvoices;
//	}
//
//	public void setProductInvoices(List<ProductInvoice> productInvoices) {
//		this.productInvoices = productInvoices;
//	}
//
//	public ProductInvoice addProductInvoice(ProductInvoice productInvoice) {
//		getProductInvoices().add(productInvoice);
//		productInvoice.setInvoice(this);
//
//		return productInvoice;
//	}
//
//	public ProductInvoice removeProductInvoice(ProductInvoice productInvoice) {
//		getProductInvoices().remove(productInvoice);
//		productInvoice.setInvoice(null);
//
//		return productInvoice;
//	}

}