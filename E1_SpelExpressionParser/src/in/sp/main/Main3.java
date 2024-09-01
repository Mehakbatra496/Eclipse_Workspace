package in.sp.main;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Main3 
{
	public static void main(String[] args)
	{
		ExpressionParser parsor = new SpelExpressionParser();	
		
//		Expression expression = parsor.parseExpression(" 10 == 10.5 ");
//		System.out.println(expression.getValue());
		
//		Expression expression = parsor.parseExpression(" 10 ne 20 ");
//		System.out.println(expression.getValue());
		
//		Expression expression = parsor.parseExpression(" (10 < 20) && (30 < 40) ");
//		System.out.println(expression.getValue());
		
//		Expression expression = parsor.parseExpression(" (10 > 20) ? '111' : '222' ");
//		System.out.println(expression.getValue());

		Expression expression = parsor.parseExpression(" T(java.lang.String) ");
		System.out.println(expression.getValue());
		
//		Expression expression = parsor.parseExpression(" T(org.springframework.expression.ExpressionParser) ");
//		System.out.println(expression.getValue());
	}
}


