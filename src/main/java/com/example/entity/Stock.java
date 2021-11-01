package com.example.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the stock database table.
 * 
 */
@Entity
@NamedQuery(name="Stock.findAll", query="SELECT s FROM Stock s")
@Data
@NoArgsConstructor
public class Stock implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int stockId;

	private int lotId;

	@ManyToOne
	@JoinColumn(name="warehouseId")
	private Warehouse warehouse;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDateTime;

	private String createdUser;

	//Expiry date
	@Temporal(TemporalType.DATE)
	private Date expiryDate;

	private int quantity;

	@ManyToOne
	@JoinColumn(name="productId")
	private Product product;

	@ManyToOne
	@JoinColumn(name="supplierId")
	private Supplier supplier;

	@ManyToOne
	@JoinColumn(name="categoryId")
	private Category category;

	//traceable or not
	private boolean isTraceable;

	@OneToOne
	@JoinColumn(name = "locationCode")
	private Location location;



}