import java.util.Scanner;

class SwapOfTwo{
     public static void main(String[] args)
     {
      int a,b,temp;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter First number :");
      a= sc.nextInt();
      System.out.println("first number" +a);     

      System.out.println("Enter second number :");
      b= sc.nextInt();
      System.out.println("second number" +b);
       
      temp = a;
      a = b;
      b= temp;
     
      System.out.println("first number after Swap :" +a);

      System.out.println("second number after swap :" +b);
       
     
     }
}

/*
C:\Users\HP\Desktop\Java Class Codes\Assignment1>java SwapOfTwo
Enter First number :
12
first number12
Enter second number :
32
second number32
first number after Swap :32
second number after swap :12
*/





 

 