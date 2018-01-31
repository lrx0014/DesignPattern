package h23_Observer;

import java.util.EventListener;

public interface SearchEventListener extends EventListener{
	public void validateSearch(SearchEvent event);
}
