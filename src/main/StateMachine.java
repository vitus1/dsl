package main;

import main.metamodel.Machine;
import main.metamodel.State;
import main.metamodel.Transition;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StateMachine {
	private Map<String, State> states = new HashMap<>();
	private Set<String> variables = new HashSet<>();
	private State current;
	private State initial;
	private String currentEvent;
	public Machine build() {
		return new Machine(states.values(),initial, variables);
	}

	public StateMachine state(String string) {
		if(!states.containsKey(string)){
			states.put(string, new State(string));
		}
		current = states.get(string);
		return this;
	}

	public StateMachine initial() {
		initial = current;
		return this;
	}

	public StateMachine when(String string) {
		currentEvent = string;
		return this;
	}
	private State getState(String name) {
		if(!states.containsKey(name)) states.put(name, new State(name));
		return states.get(name);
	}
	public StateMachine to(String string) {
		Transition t = new Transition(currentEvent,getState(string));
		current.addTransition(t);
		return this;
	}

	public StateMachine integer(String string) {
		variables.add(string);
		return this;
	}

	public StateMachine set(String string, int i) {

	return this;

	}

	public StateMachine increment(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public StateMachine decrement(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public StateMachine ifEquals(String string, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public StateMachine ifGreaterThan(String string, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public StateMachine ifLessThan(String string, int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
