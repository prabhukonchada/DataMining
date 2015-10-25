// Implementing Double Stack

import java.io.*;
import java.util.*;

public class DoubleStack
{
  ArrayList doubleStack;
  Scanner inputScanner;
  int topOfStackOne=-1,topOfStackTwo=-1;

  public static void main(String args[])
  {
    DoubleStack myDoubleStack = new DoubleStack();
    myDoubleStack.inputScanner = new Scanner(System.in);
    System.out.println("Enter the size of double stack");

    int size = myDoubleStack.inputScanner.nextInt();

    myDoubleStack.doubleStack = new ArrayList(size);

    while(1)
    {
      int stackNumber;
      System.out.println("Enter Stack Number\n 1: StackOne \n 2:StackTwo")
      stackNumber = myDoubleStack.inputScanner.nextInt();


    }


  }

  private void push()
  {

  }

  private void pop()
  {

  }

  private void printStackElements()
  {

  }
}
