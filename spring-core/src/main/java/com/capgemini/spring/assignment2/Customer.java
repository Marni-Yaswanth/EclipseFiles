package com.capgemini.spring.assignment2;

public class Customer {
	 int customercode;
	 String customername;
	 String city;
	 double ordervalue;
	public int getCustomercode() {
		return customercode;
	}
	public void setCustomercode(int customercode) {
		this.customercode = customercode;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getOrdervalue() {
		return ordervalue;
	}
	public void setOrdervalue(double ordervalue) {
		this.ordervalue = ordervalue;
	}
	public double computeDiscount(double ordervalue)
	{
		double Netamount=0;
		double discount=0;
		if (ordervalue>25000)
		{
			discount=(ordervalue*0.1);
			Netamount = ordervalue-discount;
		}
		else if(ordervalue>10000 && ordervalue<=25000)
		{
			discount=(ordervalue*0.05);
			Netamount = ordervalue-discount;
		}
		else {
			discount=0;
			Netamount = ordervalue-discount;
		}
		return Netamount;
	}
	public void Show_customer()
	{
		System.out.println(customercode);
		System.out.println(customername);
		System.out.println(city);
		System.out.println("order value is : "+ordervalue);
		System.out.println("net amount is : "+computeDiscount(ordervalue));
	}
	}
