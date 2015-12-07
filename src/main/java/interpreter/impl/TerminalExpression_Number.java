package interpreter.impl;

import java.util.Stack;

import interpreter.interfaces.Expression;

public class TerminalExpression_Number implements Expression {
	private int number;

	public TerminalExpression_Number(int number) {
		this.number = number;
	}

	public void interpret(Stack<Integer> s) {
		s.push(number);
	}
}
