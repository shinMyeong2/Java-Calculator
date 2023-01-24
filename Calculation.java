public class Calculation {
  public Calculation() {}

  public void plus(int num1, int num2) {
    int total = num1 + num2;
    System.out.print(total);
  }

  public void minus(int num1, int num2) {
    int total = num1 - num2;
    System.out.print(total);
  }

  public void multiply(int num1, int num2) {
    int total = num1 * num2;
    System.out.print(total);
  }

  public void divide(int num1, int num2) {
    try {
      int total = num1 / num2;
      System.out.print(total);
    } catch(ArithmeticException e) {
      System.out.print("be indivisible by zero!");
    }
  }
  
}