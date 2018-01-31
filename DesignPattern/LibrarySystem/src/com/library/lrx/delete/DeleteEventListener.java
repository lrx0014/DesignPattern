package com.library.lrx.delete;

import java.util.EventListener;

public interface DeleteEventListener extends EventListener{
	public void validateLogin(DeleteEvent event);
}
