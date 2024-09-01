package in.sp.main;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Main4
{
	public static void main(String[] args) 
	{
		ExpressionParser parsor = new SpelExpressionParser();
		
//		String str_exp = " 'deepak panwar'.length() ";
		
//		System.out.println(str_exp);
//
//		Expression expression = parsor.parseExpression(str_exp);
//		
//		System.out.println(expression.getValue());
		
		
//		String str_exp = " 'deepak panwar'.toUpperCase() ";
//		Expression expression = parsor.parseExpression(str_exp);
//		System.out.println(expression.getValue());
		
		
		String str_exp = " 'deepak' + 'panwar' ";
		Expression expression = parsor.parseExpression(str_exp);
		System.out.println(expression.getValue());
	}
}
