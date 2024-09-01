package in.sp.main;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Main1
{
	public static void main(String[] args)
	{
		ExpressionParser parsor = new SpelExpressionParser();
		
//		Expression expression = parsor.parseExpression(" T(in.sp.main.MyClass1).m1() ");
//		Expression expression = parsor.parseExpression(" new in.sp.main.MyClass1().m2() ");

//		expression.getValue();
		
		
//		Expression expression = parsor.parseExpression(" T(in.sp.main.MyClass1).m3() ");
//		Object obj = expression.getValue();
//		System.out.println(obj);
		
		
		Expression expression = parsor.parseExpression(" T(in.sp.main.MyClass1).m3() ");
		int i = (int) expression.getValue();
		System.out.println(i);
		
		
//		Expression expression = parsor.parseExpression(" T(in.sp.main.MyClass1).m3() ");
//		int i = expression.getValue(Integer.class);
//		System.out.println(i);
		
		
//		Expression expression = parsor.parseExpression(" new in.sp.main.MyClass1().m2() ");
//		expression.getValue();
	}
}
