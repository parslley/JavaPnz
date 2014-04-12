import java.util.*;
class z3_2
{
  static Scanner reader = new Scanner(System.in);
  public static void main (String[] args)
  {
    System.out.println("¬ведите значение в сантиметрах: ");
    double S=reader.nextDouble();
    S*=2.54;
    System.out.println("«начение в дюймах: "+S);
  }
}