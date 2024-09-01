package in.sp.main;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Main5
{
	public static void main(String[] args) 
	{
		ExpressionParser parsor = new SpelExpressionParser();
		
		
//		String str_exp = " 'deepak' matches 'Deepak'  ";
//		Expression expression = parsor.parseExpression(str_exp);
//		System.out.println(expression.getValue());
		
		
//		String str_exp = " 'amit' matches '[a-zA-Z]{5,15}' ";
//		Expression expression = parsor.parseExpression(str_exp);
//		System.out.println(expression.getValue());
		
		
//		String str_exp = " 'deepak panwar' matches '[a-zA-Z ]{5,15}' ";
//		Expression expression = parsor.parseExpression(str_exp);
//		System.out.println(expression.getValue());
		
		
//		String str_exp = " '9888755565' matches '[0-5]{10}' ";
//		Expression expression = parsor.parseExpression(str_exp);
//		System.out.println(expression.getValue());
		
		
		String str_exp = " 'deepak_123@gmail.com' matches '[a-zA-Z0-9_]*@gmail.com' ";
		Expression expression = parsor.parseExpression(str_exp);
		System.out.println(expression.getValue());
	}
}