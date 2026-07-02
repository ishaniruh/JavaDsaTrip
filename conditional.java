// simple if else 
// public class conditional {
//     public static void main(String args[]){
//         int salary = 24000;
//         if(salary > 20000){
//             salary = salary + 20000;
//         }else{
//             salary = salary + 10000;
//         }
//         System.out.println(salary);
//     }
    
// }


// multiple if else
// public class conditional{
//     public void studentGrade(int marks) {
      
//       if(marks>=90){
//         System.out.print("Grade A");
//       }
//       else if(marks >= 70 && marks <=89){
//         System.out.print("Grade B");
//       }
//       else if(marks >= 50 && marks <=69){
//         System.out.print("Grade C");
//       }
//       else if(marks >=35 && marks <=49){
//         System.out.print("Grade D");
//       }
//       else{
//         System.out.print("Fail");
//       }

//     }
// } 


//  Ques 
//  leap year 

//  // You are using Java
//     public static void main(String[] args) {
//         //Type your code here
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         if (n% 4 == 0){
//             System.out.println( n + " " + "is a Leap Year");
//         }else{
//             System.out.println(n + " " + "is not a Leap Year");
//         }
//     }


// ques : triangles
// // You are using Java
//     public static void main(String[] args) {
//         //Type your code here
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();
//          if (a == b && b == c) {
//             System.out.println("The triangle is equilateral");
//         } else if (a == b || b == c || c == a) {
//             System.out.println("The triangle is isosceles");
//         } else {
//             System.out.println("The triangle is scalene");
//         }

//         // Check if right-angled (Pythagoras theorem)
//         if (a * a + b * b == c * c ||
//             b * b + c * c == a * a ||
//             c * c + a * a == b * b) {
//             System.out.println("The triangle is also right-angled");
//         }
//     }



// QUES   The output prints the sum of the digits and a message indicating whether it's less than 10 or not.
// // "Digit Sum: <<sum>>
// // The sum of the digits is less/not less than <<sum>>."
// // If n is not a two-digit number, print "Not a valid two-digit number."

import java.util.Scanner;
public class conditional{
    public static void main(String args[]){
        Scanner  sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tens = n/10;
        int ones = n%10;
        int sum = tens + ones;
        if(n>=10 && n<=99){
            if(sum <10){
                System.out.println("Digit sum : " +sum);
                System.out.println("the sum of the digit less than 10 which is " + sum );
            }else{
                System.out.println("Digit sum : " +sum);
                System.out.println("the sum of the digit not less than 10 which is " + sum );
            }
        }else{
            System.out.println("not a valid 2 digit number");
        }



        
    }
}