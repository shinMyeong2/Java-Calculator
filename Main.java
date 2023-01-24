import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Calculation calc = new Calculation();

    //input number and operator
    System.out.print("number1 : ");  int num1 = input.nextInt();
    System.out.print("number2 : ");  int num2 = input.nextInt();
    System.out.print("operator : "); String oper = input.next();

    //operator type check
    System.out.println(oper.getClass().getName());

    //Calculation process
    System.out.printf("%d %s %d = ", num1, oper, num2); //formula print
    if(oper.equals("+"))        //plus
      calc.plus(num1,num2);
    else if(oper.equals("-"))   //minus
      calc.minus(num1,num2);
    else if(oper.equals("*"))   //multifly
      calc.multiply(num1,num2);
    else if(oper.equals("%"))   //divide
      calc.divide(num1,num2);
    else                        //fail
      System.out.print("Calculation failed!");
  }
}