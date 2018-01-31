package com.library.lrx.login;

import java.util.EventListener;

public interface LoginEventListener extends EventListener{
	public void validateLogin(LoginEvent event);
}
