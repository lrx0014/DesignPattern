package com.library.lrx.search;

import java.util.EventListener;

public interface SearchEventListener extends EventListener{
	public void validateLogin(SearchEvent event);
}
