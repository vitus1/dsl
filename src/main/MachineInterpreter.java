package main;

import main.metamodel.Machine;
import main.metamodel.State;
import main.metamodel.Transition;

import java.util.HashMap;

public class MachineInterpreter {

	private Machine machine;
	private State current;
	HashMap<String,Integer> variables = new HashMap<>();

	public void run(Machine m) {
		current = m.getInitialState();
		
	}

	public State getCurrentState() {
		return current;
	}

	public void processEvent(String string) {
		for(Transition t: current.getTransitions()) {
			if(t.getEvent().equals(string)) {
				current = t.getTarget();
			}
		}
		System.err.println("Unhandled event "+string);
	}

	public int getInteger(String string) {
		return variables.get(string);
	}

}
