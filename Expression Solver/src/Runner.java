//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Integer.*;
import static java.lang.System.*;

public class Runner
{
	public static void main( String args[] )
	{
		ExpressionSolver t = new ExpressionSolver("2 * 2 + 5 / 2");
		t.setExpression("2 * 2 + 5 / 2");
		t.solveExpression();
		
		out.println(t);
	}
}