package interpreter;

import interpreter.impl.Parser;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String expression = "42 4 2 - +";
        Parser p = new Parser(expression);
        System.out.println("'" + expression +"' equals " + p.evaluate());
	}
}
