package Java_8_Lambda;

@FunctionalInterface
interface SingleParameter
{

	//A method with single parameter
    public int incrementByFive(int a);
}
public class LambdaExpressionSingleparameter 
{

   public static void main(String args[])
   {
        // lambda expression with single parameter num
    	SingleParameter f = (num) -> num+5;
        System.out.println(f.incrementByFive(22));
    }
}