// Implementing Double Stack

import java.io.*;
import java.util.*;

public class DoubleStack
{
  int  doubleStack[];
  Scanner inputScanner;
  int topOfStackOne=-1,topOfStackTwo,sizeOfDoubleStack;
  int baseOfStackOne=-1,baseOfStackTwo;

  public static void main(String args[])
  {
    DoubleStack myDoubleStack = new DoubleStack();
    myDoubleStack.inputScanner = new Scanner(System.in);
    System.out.println("Enter the size of double stack");

    myDoubleStack.sizeOfDoubleStack = myDoubleStack.inputScanner.nextInt();
    myDoubleStack.topOfStackTwo=(myDoubleStack.sizeOfDoubleStack);

    myDoubleStack.doubleStack = new int[myDoubleStack.sizeOfDoubleStack];

  /*  for(int i=0;i<myDoubleStack.sizeOfDoubleStack;i++)
    {
      myDoubleStack.doubleStack.add(0);
    }*/

    while(true)
    {

      System.out.println("Enter Stack Number\n 1: StackOne \n 2:StackTwo");
      int stackNumber = myDoubleStack.inputScanner.nextInt();

      // Initialize the index values of the bases of the stack

      myDoubleStack.baseOfStackOne=0;
      // System.out.println(myDoubleStack.sizeOfDoubleStack);
      // //TODO : Display Menu To Either Push / Pop / Display / Exit
      System.out.println("1. Push Into The Stack");
      System.out.println("2. Pop From The Stack");
      System.out.println("3. Display Elements In The Stack");

      int selectedChoice = myDoubleStack.inputScanner.nextInt();

      switch(selectedChoice)
      {
        case 1:
          System.out.println("Enter an element to push");
          int element=myDoubleStack.inputScanner.nextInt();
          myDoubleStack.push(stackNumber,myDoubleStack,element);
          break;

        case 2:
          myDoubleStack.pop(stackNumber);
          break;

        case 3:
          myDoubleStack.printStackElements(stackNumber,myDoubleStack);
          break;

        case 4:
          System.exit(0);
      }

    }


  }


  // TODO : Implement Push Functionality for the double stack
  private void push(int stackNumber,DoubleStack doubleStackObject,int element)
  {
      int topIndexValue;
      if(stackNumber==1)
      {
        topIndexValue = doubleStackObject.topOfStackOne;

        if(topIndexValue >= doubleStackObject.topOfStackTwo-1)
        {
          System.out.println("Stack One Overflowed");
          return;
        }
        doubleStackObject.topOfStackOne=++topIndexValue;
      //  System.out.println(doubleStackObject.topOfStackOne);
      }
      else
      {
        topIndexValue = doubleStackObject.topOfStackTwo;
        if(topIndexValue <= (doubleStackObject.topOfStackOne)+1)
        {
          System.out.println("Stack Two Overflowed");
          return;
        }

        doubleStackObject.topOfStackTwo=--topIndexValue;
        System.out.println("topOfStackTwo "+doubleStackObject.topOfStackTwo+"topIndexValue"+topIndexValue);

      }
      doubleStackObject.doubleStack[topIndexValue]=element;
  }

  // TODO : Implement Pop Functionality for the double stack
  private void pop(int stackNumber)
  {

  }

  // TODO : Pretty Print the list of elements in the respective selected stack
  private void printStackElements(int stackNumber,DoubleStack doubleStackObject)
  {
    //System.out.println(doubleStackObject.doubleStack.get(0));

      if(stackNumber == 1)
      {
        for(int i=doubleStackObject.topOfStackOne;i>=0;i--)
        {
          System.out.println(doubleStackObject.doubleStack[i]);
        }
      }
      else if(stackNumber == 2)
      {
        System.out.println("value of top stack2"+doubleStackObject.topOfStackTwo);
        for(int i=doubleStackObject.topOfStackTwo;i<=(doubleStackObject.sizeOfDoubleStack)-1;i++)
        {
          System.out.println(doubleStackObject.doubleStack[i]);
        }
      }
  }
}
