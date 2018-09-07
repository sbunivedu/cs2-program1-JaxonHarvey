public class CharStack
{ // Main
  private final int MAX_CAP = 100;
  private int top; //location of top item on the stack
  private char [] s; //The stack

  public CharStack()
  {
    s = new char[MAX_CAP];
    top = -1;
  }

  public void push(char element)
  { // push
    if ( isFull() )
    { // If
      System.out.println("The stack is full" );
    } // If
    else
    { // Else
      //System.out.println(top);
      top++;
      //System.out.println(top);
      s[top] = element;
    } // Else

  } // push

  public char pop ()
  { // pop
    char temp = s[top];
    top--;
    return temp;
  } // pop

  public boolean isEmpty()
  { // isEmpty
    if ( top == -1 )
    { // if
      return true;
    } // if
    else
    { // else
      return false;
    } // else
  } // isEmpty

  public int size()
  { // Int Size
    return top + 1;
  } // Int Size

  public boolean isFull()
  { // isFull
    if ( top+1 == MAX_CAP )
    { // If
      return true;
    } // If
    else
    { // Else
      return false;
    } // Else

  } // isFull

  public String toString()
  { // toString
    String toString="";
    for (int i = top ; i >= 0; i--)
    { // for
       toString = toString + s[i];
    } // for

    return toString;
  } // toString

  public char peek()
    { // Peek
      if ( isEmpty() == false )
      { // If
        return s[top];
      } // If
      else
      { // Else
        System.out.println( "Stack was empty" );
        return ' ';
      } // Else

    } // Peek

} // Main
