package com.capg.project.controller;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.capg.project.entity.BillDetails;
import com.capg.project.service.BillDetailsService;
import com.capg.project.service.IBillDetailsService;

@RestController
public class BillDetailsController {
	
@Autowired
IBillDetailsService billDetailsServiceObj;

@PostMapping("/add")
public boolean addAccount(@RequestBody BillDetails billDetails) 
	{
		return billDetailsServiceObj.addBillAccount(billDetails);
	}

@GetMapping("/delete/{id}")
public void deleteAccount(@PathVariable(value = "id")  BigInteger id){
    billDetailsServiceObj.deleteBillAccount(id);
	//return void;
}

@GetMapping("/viewAccountById/{no}")
public List<BillDetails> viewAccount(@PathVariable(value="no") BigInteger accountNumber) 
	{	
		return billDetailsServiceObj.viewBillAccount(accountNumber);
	}

@RequestMapping("/list")//maps web requests
public List<BillDetails> viewAllAccount(Model modelObj)
	{
	//System.out.println("List of account");
	 	return billDetailsServiceObj.viewAllBillAccounts();
	}
	
}