/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackimplement;
import java.util.Scanner;
/**
 *
 * @author Ravi
 */
public class StackImplement {
    static  Scanner sc=new Scanner(System.in);
    static int stack[],top = -1,size;
    static
    {
      create();
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
     int n,item;
     while(true)
     {
        System.out.println("1. Push");
        System.out.println("2. Pop");
        System.out.println("3. Peep");
        System.out.println("4. Traverse");
        System.out.println("5. Quit");
        System.out.println("Enter Your Choice: ");
        System.out.println("--------------------------");
        n=StackImplement.sc.nextInt();
        
       switch(n)
       {
          case 1: System.out.print("Enter element to push: "); 
                  item=sc.nextInt();
                  StackImplement.push(item);
                  break;
          case 2: item=StackImplement.pop();
                  if(item == 0)
                  {
                      System.out.println("Stack Underflow:");
                      System.out.println("--------------------------");
                  }
                  else{
                      System.out.println("Pop item is :"+item);
                      System.out.println("--------------------------");
                  }
                  break;
           case 3: item=StackImplement.peep();
                  if(item == 0)
                  {
                      System.out.println("Stack Underflow:");
                      System.out.println("--------------------------");
                  }
                  else{
                      System.out.println("Peep item is: "+item);
                      System.out.println("--------------------------");
                  }
                  break;
           case 4: StackImplement.traverse();
                   break;
           case 5: System.exit(1);
                   break;
           default : System.out.println("Invalid Choice...?");
                     System.out.println("--------------------------");
        }
      }
    } 
      public static void push(int item)
      {
          if(StackImplement.isFull())
          {
              System.out.println("Stack Overflow:");
              System.out.println("--------------------------");
          }
          else
          {
              ++top;
              stack[top] = item;
          }
      }
      
      static boolean isFull()
      {
          if(top == size-1)
          {
              return true;
          }
          else{
              return false;
          }
      }
      
      public static int pop()
      {
          if(StackImplement.isEmpty())
          {
              return 0;
          }
          else
          {
              return stack[top--];
          }
      }
      
      public static int peep()
      {
          if(StackImplement.isEmpty())
          {
              return 0;
          }
          else
          {
              return stack[top];
          }
      }
      
      static boolean isEmpty()
      {
          if(StackImplement.top == -1)
          {
               return true;
          }
          else
          {
              return false;
          }
      }
      
      
      public static void traverse()
      {
          if(StackImplement.isEmpty())
          {
              System.out.println("Stack is Empty:");
          }
          else
          {
              System.out.print("Stack elements are: ");
          
              for(int i=top ;i>=1 ;i--)
              {
                  System.out.print(stack[i]+",");
              }
              System.out.print(stack[0]);
              System.out.println();
              System.out.println("--------------------------");
          }
      }
      
      static void create()
      {
          
          System.out.print("Enter the size: ");
          size=StackImplement.sc.nextInt();
          StackImplement.stack = new int[size];
          System.out.println("Stack created with size: "+size);
      }
    
}
