package com.capg.project.entity;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bill_details")
public class BillDetails {
@Id
private BigInteger billNo;
private String holderName;
private String connectionCode;
private String billamount;

public BigInteger getBillNo() {
	return billNo;
}
public void setAccountNo(BigInteger billNo) {
	this.billNo = billNo;
}
public String getHolderName() {
	return holderName;
}
public void setHolderName(String holderName) {
	this.holderName = holderName;
}
public String getconnectionCode() {
	return connectionCode;
}
public void setconnectionCode(String connectionCode) {
	this.connectionCode = connectionCode;
}
public String getBillAmount() {
	return billamount;
}
public void setBillAmount(String billAmount) {
	this.billamount = billAmount;
}

public BillDetails(BigInteger billNo, String holderName, String connectionCode, String billamount) {
	super();
	this.billNo = billNo;
	this.holderName = holderName;
	this.connectionCode = connectionCode;
	this.billamount = billamount;
}
public BillDetails() {}
}
