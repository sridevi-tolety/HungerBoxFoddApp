package com.myorg.hungerbox.models;

import javax.persistence.Entity;

@Entity
public class FoodOrder {
	
	private Long Id;
	private String vendorname;
	private String itemname;
	private double priceperunit;
	private double amountpayable;
	private Long cardnumber;
	private Long ordernumber;
	public FoodOrder() {}
	public FoodOrder(Long id, String vendorname, String itemname, double priceperunit, double amountpayable,
			Long cardnumber, Long ordernumber) {
		super();
		Id = id;
		this.vendorname = vendorname;
		this.itemname = itemname;
		this.priceperunit = priceperunit;
		this.amountpayable = amountpayable;
		this.cardnumber = cardnumber;
		this.ordernumber = ordernumber;
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getVendorname() {
		return vendorname;
	}
	public void setVendorname(String vendorname) {
		this.vendorname = vendorname;
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
	public double getAmountpayable() {
		return amountpayable;
	}
	public void setAmountpayable(double amountpayable) {
		this.amountpayable = amountpayable;
	}
	public Long getCardnumber() {
		return cardnumber;
	}
	public void setCardnumber(Long cardnumber) {
		this.cardnumber = cardnumber;
	}
	public Long getOrdernumber() {
		return ordernumber;
	}
	public void setOrdernumber(Long ordernumber) {
		this.ordernumber = ordernumber;
	}

}
