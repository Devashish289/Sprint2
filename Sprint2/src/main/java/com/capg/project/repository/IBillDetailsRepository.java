package com.capg.project.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.capg.project.entity.BillDetails;

@Repository("bankDetailsRepository") //object
public interface IBillDetailsRepository extends JpaRepository<BillDetails,BigInteger>{
	
	@Transactional //defines the scope of single database transaction
	@Modifying // used to enhance the @Query annotation to execute not only SELECT queries but also INSERT, UPDATE, DELETE
	@Query("delete from BillDetails b where b.accountNo=?1") //executes SQL query
	public void deleteAccountByNo(BigInteger id);
	
	@Query("select b from BillDetails b where b.accountNo=?1")
	public List<BillDetails>getAccountDetails(BigInteger id);
	
}