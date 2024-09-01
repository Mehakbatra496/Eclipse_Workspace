package in.sp.main;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Main2
{
	public static void main(String[] args)
	{
		ExpressionParser parsor = new SpelExpressionParser();
		
		
		// T is because m1() is a static method
        Expression ex1 = parsor.parseExpression("T(in.sp.main.MyClass2).m1('MHK Batra MMM')");
		ex1.getValue();
	
		// new keyword because m2() is instance method
		Expression ex3 = parsor.parseExpression("new in.sp.main.MyClass2().m2(777)");
		ex3.getValue();

		
		
	}
}
