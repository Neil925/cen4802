package fib;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("What number would you like to fib?:  ");
    int n = scanner.nextInt();

    System.out.println("Fib of " + n + " is: " + fib(n));

    scanner.close();
  }

  /**
   * Returns the nth Fibonacci value through recursion.
   * 
   * @param n Which Fibonacci value to return.
   * @return Integer value of resulting Fibonacci calculation.
   */
  public static int fib(int n) {
    if (n == 0)
      return 0;

    if (n == 1)
      return 1;

    return fib(n - 1) + fib(n - 2);
  }
}
