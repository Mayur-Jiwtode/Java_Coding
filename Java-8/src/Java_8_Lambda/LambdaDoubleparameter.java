package Java_8_Lambda;

interface StringConcat
{

    public String sconcat(String a, String b);
}
public class LambdaDoubleparameter {

   public static void main(String args[]) 
   
    {
        // lambda expression with multiple arguments
    	StringConcat s = (str1, str2) -> str1 + str2;
        System.out.println("full name : " + s.sconcat("Mayur ","Jiwtode"));
    }
}