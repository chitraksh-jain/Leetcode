//given a number check if it can be expressed as sum of two prime number 
//input 27          input 9
//output no         output yes
// assume the number is odd
import java.util.*;
  public  class  sumof_two_num_prime{
          public static void main(String[] args) {
              Scanner sc =new Scanner(System.in);
              System.out.println("enter the number:");
              int num=sc.nextInt();
              System.out.println(isPrime(num-2));
             
 }
 public static boolean isPrime(int num) {
  if (num <= 1)
  return false;
  for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0)
       return false;
  }
  return true;
}
}