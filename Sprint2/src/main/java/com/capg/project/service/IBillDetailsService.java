package com.capg.project.service;

import java.math.BigInteger;
import java.util.List;
import com.capg.project.entity.BillDetails;

public interface IBillDetailsService {
	
public boolean addBillAccount(BillDetails billDetailsObj);
public List<BillDetails> viewBillAccount(BigInteger billNumber);
public List<BillDetails> viewAllBillAccounts();
public boolean deleteBillAccount(BigInteger billNumber);

}