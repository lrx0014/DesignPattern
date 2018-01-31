package h22_Memento;

import java.util.Stack;

public class CareTaker {
	private Stack<Memento> mementos = new Stack<Memento>();
	
	public Memento getMemento(){
		Memento thismem = mementos.pop();
		return thismem;
	}
	
	public void setMemento(Memento memento){
		this.mementos.push(memento);
	}
}
