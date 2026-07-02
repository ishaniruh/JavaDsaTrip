// print 5 numbers
// public class loop {
//     public static void main(String args[]){
//         for(int i =0;i<5;i++){
//             System.out.println(i);
//         }  
//     }  
// }


// nested loop
// public class loop{
//     public static void main(String[] args) {
//         for(int i =0;i<5;i++){
//             for(int j = 0;j<5;j++){
//                 System.out.print("*");

//             }
//             System.out.println();
//         }
        
//     }
// }

// infinite loop
//  public class loop{
//    public static void main(String args[]){
//         for(int i =0; i>=0;i++){
//            System.out.println(i);

//         }
//         }
// }


// import java.util.Scanner;
// public class loop{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i = 1; i <= n ;i++){
//             System.out.println( i);
//         }
//     }
// }



// with while loop
// import java.util.Scanner;
// public class loop{
//     public  static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int i = 1;
//     while(i<=n){
//         System.out.println(i);
//         i++;
//     }
// }

// }


// import java.util.Scanner;
// public class loop{
//     public static void main(String args[]){
//         Scanner in = new Scanner(System.in);
//         int n = in.nextInt();
//         int product = 1;
//         boolean hasodd = false;
//         while(n>0){
//             int digit = n%10;
//             if(digit % 2 != 0){
//                 product *= digit;
//                 hasodd = true;
//             }
//         n = n / 10;    
//         }
//         if(hasodd == true){
//             System.out.println(product);
//         }else{
//             System.out.println("No odd digit found");
//         }
//     }
// }


sum of numbers
 public class loop {
    public int forLoop(int low, int high) {
        int sum = 0;
        for(int i = low; i<= high ; i++){
            sum = sum +i;

        }
        
        return sum;
    }
}
