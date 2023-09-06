package com.example.shoeProductDatabase.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.example.shoeProductDatabase.Entity.Shoeproduct;

public interface ShoeproductRepo extends JpaRepository<Shoeproduct, Integer> {

	@Query(value =  "select * from Shoeproduct  where productname =?" , nativeQuery = true)
	Shoeproduct findByProductname(String Productname);
}
