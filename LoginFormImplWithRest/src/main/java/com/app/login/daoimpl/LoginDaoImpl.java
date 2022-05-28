package com.app.login.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.login.dao.LoginDao;
import com.app.login.entity.LoginEntity;
import com.app.login.repo.LoginRepo;

@Service
public class LoginDaoImpl implements LoginDao{
	
@Autowired
LoginRepo loginRepo;
	@Override
	public LoginEntity getLoginData() {
		// TODO Auto-generated method stub
		List<LoginEntity> findAll = loginRepo.findAll();
		for(LoginEntity login:findAll) {
			if(login != null)	
				return login;
		}
		return null;
	}

}
