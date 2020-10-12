package com.app.login.servlet;

import com.app.login.exception.BusinessException;
import com.app.login.model.User;

public interface LoginService {

	public boolean isValidUserCredentials(User user) throws BusinessException;
	
	
}
