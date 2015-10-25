// Implementing Double Stack

import java.io.*;
import java.util.*;

public class DoubleStack
{
  ArrayList doubleStack;
  Scanner inputScanner;
  int topOfStackOne=-1,topOfStackTwo=-1;
  int baseOfStackOne=-1,baseOfStackTwo=-1;

  public static void main(String args[])
  {
    DoubleStack myDoubleStack = new DoubleStack();
    myDoubleStack.inputScanner = new Scanner(System.in);
    System.out.println("Enter the size of double stack");

    int size = myDoubleStack.inputScanner.nextInt();
    myDoubleStack.doubleStack = new ArrayList(size);

    while(1)
    {

      System.out.println("Enter Stack Number\n 1: StackOne \n 2:StackTwo")
      int stackNumber = myDoubleStack.inputScanner.nextInt();

      // Initialize the index values of the bases of the stack

      myDoubleStack.baseOfStackOne=0;
      myDoubleStack.baseOfStackTwo=myDoubleStack.topOfStackOne;

      //TODO : Display Menu To Either Push / Pop / Display / Exit
      System.out.println("1. Push Into The Stack");
      System.out.println("2. Pop From The Stack");
      System.out.println("3. Display Elements In The Stack");

      int selectedChoice = myDoubleStack.inputScanner.nextInt();

      switch(selectedChoice)
      {
        case 1:
          push(stackNumber);
          break;

        case 2:
          pop(stackNumber);
          break;

        case 3:
          printStackElements(stackNumber);
          break;

        case 4:
          System.exit(0);
      }

    }


  }


  // TODO : Implement Push Functionality for the double stack
  private void push()
  {

  }

  // TODO : Implement Pop Functionality for the double stack
  private void pop()
  {

  }

  // TODO : Pretty Print the list of elements in the respective selected stack
  private void printStackElements()
  {

  }
}
