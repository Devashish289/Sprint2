package com.capg.project.entity;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bill_details")
public class BillDetails {
@Id
private BigInteger accountNo;
private String holderName;
private String connectionCode;
private String boardName;

public BigInteger getAccountNo() {
	return accountNo;
}
public void setAccountNo(BigInteger accountNo) {
	this.accountNo = accountNo;
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

public BillDetails(BigInteger accountNo, String holderName, String connectionCode, String boardName) {
	super();
	this.accountNo = accountNo;
	this.holderName = holderName;
	this.connectionCode = connectionCode;
	this.boardName = boardName;
}
public BillDetails() {}
}
