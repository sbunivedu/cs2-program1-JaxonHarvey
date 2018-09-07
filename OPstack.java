import java.util.Scanner;

public class OPstack
{ // /class

  public static boolean isOperand(char c){
    if(
      (c>='a' && c<='z') ||
      (c>='A' && c<='Z') ||
      (c>='0' && c<='9')){
        return true;
      }else{
        return false;
      }
  }
  public static boolean isOperator(char c){
    return c=='+' || c=='-' || c=='*' || c=='/';
  }
  public static int precedenceOrder(char c){
    if(c == '*' || c == '/' ){
      return 2;
    }else {
      return 1;
    }
  }

  public static void main ( String [] args )
  {
   CharStack OPstack = new CharStack();
   Scanner scan = new Scanner(System.in);
   char current ;
   String expression = "";

   // ask the user for the infix input
   System.out.println("What is the infix Input expression? ");
   expression = scan.nextLine();

   // evaluate the expression
   for ( int x = 0; x < expression.length(); x ++ )
   { // for
     // make the pointer for evaluation
     current = expression.charAt(x);

      // if it is an operand
   if (isOperand(current))
   { // if
     System.out.print(current);
   } // if

   // if it is an operator
   else if (isOperator(current))
   { // else if
    if (!OPstack.isEmpty())
    { // if
      char top = OPstack.peek();

      while (precedenceOrder(top) >= precedenceOrder(current) && top != '(' && !OPstack.isEmpty())
      { // while
        top = OPstack.peek();
        System.out.print(OPstack.pop());
       } // while

    } // if

    OPstack.push(current);

   } // else if

   // if the pointer found a left parenth )
   else if ( current == '(' )
   { // else if

     OPstack.push(current);

   } // else if

   // if it finds a right parenth
   else if ( current == ')' )
   { // else if

     while ( !OPstack.isEmpty() )
     { // while

       if ( OPstack.peek() ==  '(' )
       { // if

         OPstack.pop();
       } // if

       else
       { // else

         System.out.print(OPstack.pop());
       } // else

     } // while

   } // else if

   } // for

   while ( !OPstack.isEmpty())
   { // while

   if ( OPstack.peek() != '('  )

   { // if

     System.out.print(OPstack.pop());
   } // if

   } // while

System.out.println("");


  } // main


} // class