package com.library.lrx.add;

import java.util.EventListener;

public interface AddEventListener extends EventListener{
	public void validateLogin(AddEvent event);
}
