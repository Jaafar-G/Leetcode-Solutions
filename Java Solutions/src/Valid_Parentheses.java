import java.util.LinkedList;

public class Valid_Parentheses {
    static String s = "([])";

    public static void main(String[] args)
    {
        System.out.println(isValid("([i]])"));
    }

    public static boolean isValid(String s)
    {
        //print out original string
        System.out.println(s);
        //convert string to char array
        char[] charArray = s.toCharArray();

        //local variables
        char regularL = '(';
        char regularR = ')';
        char curlyL = '{';
        char curlyR = '}';
        char squareL = '[';
        char squareR = ']';

        LinkedList <Character> characters = new LinkedList<>();

        for ( int i=0; i <= charArray.length-1; i++ )
        {
            System.out.println("i: " + charArray[i]);
            if ( charArray[i] == regularL || charArray[i] == curlyL || charArray[i] == squareL )
            {
                characters.add(charArray[i]);
            }

        }
        return false;
    }
}
