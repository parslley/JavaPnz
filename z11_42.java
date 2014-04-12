import java.util.*;
class z11_23
{
  static Scanner reader = new Scanner(System.in);
  public static void main(String[] args)
  {
    System.out.println("Введите длину серии прогрессии: ");
    int n1 = reader.nextInt(), a1 = 7, d = 4;
    System.out.println("Начал");
    for (int n = 1; n<=n1; n++)
    {
      int a = a1 +((n-1)*d);
      System.out.print(a+" ");
    }
    System.out.println(" ");
    System.out.println("Закончил");
  }
}