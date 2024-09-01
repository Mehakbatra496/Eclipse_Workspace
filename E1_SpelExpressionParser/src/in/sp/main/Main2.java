package in.sp.main;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class Main2
{
	public static void main(String[] args)
	{
		ExpressionParser parsor = new SpelExpressionParser();
		
		Expression expression = parsor.parseExpression(" 10+20 ");
		Object obj =  expression.getValue();
		System.out.println(obj);
		
		//---------------------------------------------------------------------------
        
		ExpressionParser parsor2 = new SpelExpressionParser();
		
		EvaluationContext context = new StandardEvaluationContext();
		context.setVariable("no1", 100);
		context.setVariable("no2", 200);
		
		Expression expression2 = parsor2.parseExpression(" #no1 + #no2");
		Object obj2 = expression2.getValue(context);
		System.out.println(obj2);
	}
}
