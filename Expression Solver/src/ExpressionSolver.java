//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Integer.*;
import static java.lang.System.*;

public class ExpressionSolver
{
	//add in instance variables
	private String[] chars;
	private ArrayList<String> charz = new ArrayList();
	public ExpressionSolver(String s)
	{
		
	}

	public void setExpression(String s)
	{
		chars = s.split(" ");

		for(String item:chars){
			charz.add(item);
		}
	}

	public void solveExpression()
	{
		for(int i=0;i<charz.size();i++){
			if(charz.get(i).equals("*")){
				charz.set(i, ""+(Integer.parseInt(charz.get(i-1))*Integer.parseInt(charz.get(i+1))));
				charz.remove(i-1);
				charz.remove(i);
				i=0;
			}
			if(charz.get(i).equals("/")){
				charz.set(i, ""+(Integer.parseInt(charz.get(i-1))/Integer.parseInt(charz.get(i+1))));
				charz.remove(i-1);
				charz.remove(i);
				i=0;
			}
		}
		for(int i=0;i<charz.size();i++){
			if(charz.get(i).equals("+")){
				charz.set(i, ""+(Integer.parseInt(charz.get(i-1))+Integer.parseInt(charz.get(i+1))));
				charz.remove(i-1);
				charz.remove(i);
				i=0;
			}
			if(charz.get(i).equals("-")){
				charz.set(i, ""+(Integer.parseInt(charz.get(i-1))-Integer.parseInt(charz.get(i+1))));
				charz.remove(i-1);
				charz.remove(i);
				i=0;
			}
		}
	}

	public String toString( )
	{
		return charz.get(0);
	}
}