package com.example.shoeProductDatabase.Service;



import com.example.shoeProductDatabase.Entity.Login;

public interface LoginService {

	Login login(String email, String password);
	/*Login addUser(Login login);
	Login update(String email, Login login);
	void Delete(String email);*/
}
