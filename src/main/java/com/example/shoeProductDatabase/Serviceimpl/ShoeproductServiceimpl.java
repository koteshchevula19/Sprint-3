package com.example.shoeProductDatabase.Serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.shoeProductDatabase.Entity.Shoeproduct;
import com.example.shoeProductDatabase.Exception.ResourceNotFoundException;
import com.example.shoeProductDatabase.Repository.ShoeproductRepo;
import com.example.shoeProductDatabase.Service.ShoeproductService;

@Service
public class ShoeproductServiceimpl implements ShoeproductService {

	@Autowired
	ShoeproductRepo shoeproductrepo;
	@Override
	public Shoeproduct addProduct(Shoeproduct shoeproduct) {
		// TODO Auto-generated method stub
		return shoeproductrepo.save(shoeproduct);
	}
	
	@Override
	public Shoeproduct updateProduct(String productname, Shoeproduct shoeproduct) {
		// TODO Auto-generated method stub
      Shoeproduct s1 = shoeproductrepo.findByProductname(productname);
		
		if(s1!=null) {
			   
			s1.setProductdesc(shoeproduct.getProductdesc());// old to new set
			s1.setProductlink(shoeproduct.getProductlink());
		return shoeproductrepo.save(s1);
		} 
		else 
		{
			throw new ResourceNotFoundException();
		} 
		
	}

	@Override
	public void deleteproduct(String productname) {
		// TODO Auto-generated method stub
		Shoeproduct s2 = shoeproductrepo.findByProductname(productname);
		
		if(s2!=null) {
			shoeproductrepo.delete(s2);
		}
		else {
			throw new ResourceNotFoundException();
		}		
	}
	

}
