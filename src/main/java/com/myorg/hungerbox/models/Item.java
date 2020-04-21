package com.myorg.hungerbox.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Item {

	public Item(Long id, String vendorname, String itemcode, String itemname, double priceperunit) {
		super();
		this.id = id;
		this.vendorname = vendorname;
		this.itemcode = itemcode;
		this.itemname = itemname;
		this.priceperunit = priceperunit;
	}
	@Id
	@GeneratedValue
	private Long id;
	private String vendorname;
	public String getVendorname() {
		return vendorname;
	}

	public void setVendorname(String vendorname) {
		this.vendorname = vendorname;
	}
	private String itemcode;
	private String itemname;
	private double priceperunit;
	public Item() {}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getItemcode() {
		return itemcode;
	}
	public void setItemcode(String itemcode) {
		this.itemcode = itemcode;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public double getPriceperunit() {
		return priceperunit;
	}
	public void setPriceperunit(double priceperunit) {
		this.priceperunit = priceperunit;
	}
	
}
