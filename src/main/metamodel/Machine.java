package main.metamodel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class Machine {

	private State initialState;
	private final ArrayList<State> states = new ArrayList<>();
	private Set<String> variables;

	public Machine(Collection<State> states, State initialState, Set<String> variables) {
		super();
		this.states.addAll(states);
		this.initialState = initialState;
		this.variables = variables;
	}
	public List<State> getStates() {
		return states;
	}

	public State getInitialState() {
		return initialState;
	}

	public State getState(String string) {
		for (State s: states) {
			if(s.getName() == string)
				return s;
		}
		return null;
	}

	public int numberOfIntegers() {
		return variables.size();
	}

	public boolean hasInteger(String string) {
			return variables.contains(string);
	}

}
