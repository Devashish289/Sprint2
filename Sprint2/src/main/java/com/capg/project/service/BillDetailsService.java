package com.capg.project.service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.security.auth.login.AccountLockedException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.project.entity.BillDetails;
import com.capg.project.repository.IBillDetailsRepository;

@Service //Makes the class as service provider class
public class BillDetailsService implements IBillDetailsService{
@Autowired
IBillDetailsRepository billDetailsRepository;

@Override
public boolean addBillAccount(BillDetails billDetailsObj) {
	boolean addFlag=false;
	try {
			billDetailsRepository.save(billDetailsObj);
			addFlag=true;
	}
	catch(Exception e) 
		{
			e.printStackTrace();
		}
	return addFlag;
}

@Override
public List<BillDetails> viewBillAccount(BigInteger accountNumber) {
	List<BillDetails> accountDetails=new ArrayList<BillDetails>();
	try {
			accountDetails=billDetailsRepository.getAccountDetails(accountNumber);
		}
	catch(Exception e) 
		{
			e.printStackTrace();
		}
	return accountDetails;
}

@Override
public List<BillDetails> viewAllBillAccounts() {
	List<BillDetails> allAccountDetails=new ArrayList<BillDetails>();
	try {
			allAccountDetails=billDetailsRepository.findAll();
		}
	catch(Exception e) 
		{
			e.printStackTrace();//chill karo ho jayega
		}
	return allAccountDetails;
} 

@Override
public boolean deleteBillAccount(BigInteger accountNumber) {
	boolean deleteFlag=false;
	try {
			billDetailsRepository.deleteAccountByNo(accountNumber);
		}
	catch(Exception e)
		{
			e.printStackTrace();
			deleteFlag=true;
		}
	return deleteFlag;
}


}
