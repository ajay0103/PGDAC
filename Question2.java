
import java.util.Scanner;
class SwapOfThree{
           public static void main(String[] args) {
           int a,b,c;
           Scanner sc=new Scanner(System.in);
             System.out.println("Enter first number :" );
              a=sc.nextInt();
             System.out.println("Enter second number :" );
              b=sc.nextInt();
              System.out.println("Enter thired number:" );		
               c=sc.nextInt();
           
		
             a = a + b + c;
             b = a - (b+c); 
             c = a - (b+c);
             a = a - (b+c); 

           System.out.println("first number after swap :" +a);
           System.out.println("second number after swap: " +b);
	   System.out.println("third number after swap :" +c);	 	   
           
}
}

/*
C:\Users\HP\Desktop\CORE-JAVA\ASSIGNMENTS\Assignment1>java SwapOfThree
Enter first number :
10
Enter second number :
20
Enter thired number:
30
first number after swap :30
second number after swap: 10
third number after swap :20
*/