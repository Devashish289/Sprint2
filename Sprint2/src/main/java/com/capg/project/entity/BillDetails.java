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
private String boardName;

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
public String getBoardName() {
	return boardName;
}
public void setBoardName(String boardName) {
	this.boardName = boardName;
}

public BillDetails(BigInteger billNo, String holderName, String connectionCode, String boardName) {
	super();
	this.billNo = billNo;
	this.holderName = holderName;
	this.connectionCode = connectionCode;
	this.boardName = boardName;
}
public BillDetails() {}
}
