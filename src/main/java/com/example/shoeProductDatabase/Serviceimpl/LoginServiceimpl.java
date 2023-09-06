package com.example.shoeProductDatabase.Serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shoeProductDatabase.Entity.Login;
import com.example.shoeProductDatabase.Exception.ResourceNotFoundException;
import com.example.shoeProductDatabase.Repository.LoginRepo;
import com.example.shoeProductDatabase.Service.LoginService;
@Service
public class LoginServiceimpl implements LoginService {

	@Autowired
	LoginRepo loginrepo;

	@Override
	public Login login(String email, String password) {
		Login s = loginrepo.findByEmail(email);

		if (s != null) {
			if (s.getPassword().equals(password)) {
				return s;
			} else {
				throw new ResourceNotFoundException();
			}
		} else {
			throw new ResourceNotFoundException();
		}

	}

	/*@Override
	public Login addUser(Login login) {
		// TODO Auto-generated method stub
		System.out.println("Added a user Succesfully");
		return loginrepo.save(login);
	}

	@Override
	public Login update(String email, Login login) {
		// TODO Auto-generated method stub

//		Student s1 = studentRepo.findByid(id);
		Login login1 = loginrepo.findByEmail(email);

		if (login1 != null) {
//			s1.setFirstName(student.getFirstName());   // old to new set
//			s1.setLastName(student.getLastName());
//			s1.setPassword(student.getPassword());
			login1.setPassword(login.getPassword());
			return loginrepo.save(login1);
		} else {
			throw new ResourceNotFoundException();
		}
	}

	@Override
	public void Delete(String email) {
		// TODO Auto-generated method stub

		Login login = loginrepo.findByEmail(email);

		if (login != null) {
			loginrepo.delete(login);
		} else {
			throw new ResourceNotFoundException();
		}

	}*/

}
