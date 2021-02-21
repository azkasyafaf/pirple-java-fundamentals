/*
 * HOMEWORK #3
 * The Fundamental of Java
 * Chapter 3 - Control Flow
 */
package homework3;

/*
 * This code written by : Azka S. Firdaus
 * Tuesday, 08 September 2020
*/
public class Homework3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++)
        {
            int flag = 0;
            for (int j=2; j<i; j++)
            {
                if (i%j == 0)
                {
                    flag=1;
                    break;
                }
            }
            if (flag==0)
            {
                System.out.println("Prime");
            }
            else
            {
                if(i%3==0 && i%5==0)
                {
                    System.out.println("FizzBuzz");
                }
                else if (i%3==0 && i%5!=0)
                {
                    System.out.println("Fizz");
                }
                else if (i%3!=0 && i%5==0)
                {
                    System.out.println("Buzz");
                }
                else
                {
                    System.out.println(i);
                }
            }
        }
    }
}