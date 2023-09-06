package com.example.shoeProductDatabase.Service;

import com.example.shoeProductDatabase.Entity.Shoeproduct;

public interface ShoeproductService {
	
	Shoeproduct addProduct(Shoeproduct shoeproduct);
	
	Shoeproduct updateProduct(String productname, Shoeproduct shoeproduct);
	
	void deleteproduct(String productname);

}
