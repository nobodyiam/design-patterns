package interpreter.impl;

import java.util.Stack;

import interpreter.interfaces.Expression;

public class TerminalExpression_Plus implements Expression {
	public void interpret(Stack<Integer> s) {
		s.push(s.pop() + s.pop());
	}
}
