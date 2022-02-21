package main.metamodel;

import java.util.ArrayList;
import java.util.List;

public class State {


	private String name;
	private List<Transition> trans = new ArrayList<>();

	public State(String name) {
		super();
		this.name = name;
	}

	public void addTransition(Transition t) {
		this.trans.add(t);
	}

	public String getName() {
		return name;
	}

	public List<Transition> getTransitions() {
		return trans;
	}

	public Transition getTransitionByEvent(String string) {
		for (Transition t : trans) {
			if (t.getEvent() == string) {
				return t;
			}

		}
		return null;
	}
}
