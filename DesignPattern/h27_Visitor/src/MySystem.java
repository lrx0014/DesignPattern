

import java.util.ArrayList;
import java.util.Iterator;

public class MySystem {
	private ArrayList list=new ArrayList();
	
	public void accept(MyAccount visitor){
		Iterator i=list.iterator();
		while(i.hasNext()){
			((MyAuthority)i.next()).accept(visitor);
		}
	}
	
	public void addLevel(MyAuthority ma){
		list.add(ma);
	}
	
	public void removeLevel(MyAuthority ma){
		list.remove(ma);
	}
}
