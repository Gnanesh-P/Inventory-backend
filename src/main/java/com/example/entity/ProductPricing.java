package com.example.entity;

import java.io.Serializable;
import javax.persistence.*;


@Entity
@Table(name="product_pricing")
@NamedQuery(name="ProductPricing.findAll", query="SELECT p FROM ProductPricing p")
public class ProductPricing implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int refId;

	@ManyToOne
	private Pricing pricing;

	@ManyToOne
	private Product product;

	public ProductPricing() {
	}

	public int getRefId() {
		return this.refId;
	}

	public void setRefId(int refId) {
		this.refId = refId;
	}

	public Pricing getPricing() {
		return this.pricing;
	}

	public void setPricing(Pricing pricing) {
		this.pricing = pricing;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}