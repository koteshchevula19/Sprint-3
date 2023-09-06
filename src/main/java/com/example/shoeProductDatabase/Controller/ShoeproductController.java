package com.example.shoeProductDatabase.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import com.example.shoeProductDatabase.Entity.Shoeproduct;
import com.example.shoeProductDatabase.Service.ShoeproductService;

@RestController
public class ShoeproductController {

	
	@Autowired
	ShoeproductService shoeproductservice;
	
	
	
	@PostMapping("/post")
	public Shoeproduct addProducts(@RequestBody Shoeproduct shoeproduct) {
		
		return shoeproductservice.addProduct(shoeproduct);
	}
	
	@PutMapping("/update")
	public Shoeproduct update(@RequestHeader String productname, @RequestBody Shoeproduct shoeproduct) {

		return shoeproductservice.updateProduct(productname, shoeproduct);
	}
	
	@DeleteMapping("delete")
	public String delete(@RequestHeader String productname) {
		shoeproductservice.deleteproduct(productname);
		return "data deleted";
	}
}
