import java.util.*;
class z13_32
{
  static Scanner reader = new Scanner(System.in);
  public static void main(String[] args)
  {
    System.out.println("¬ведите кол-во слагаемых: ");
    int a=reader.nextInt();
    double s = 0;
    for (double i = 1; i<=a; i++)
    {
      s = s + (1/(i*i));
    }
    double pi1= s * 6, pi = Math.sqrt(pi1);
    System.out.println("ѕи равно: "+pi);
  }
}