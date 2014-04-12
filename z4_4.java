import java.util.*;
class z4_4
{
  static Scanner reader = new Scanner(System.in);
  public static void main (String[] args)
  {
    System.out.println("Введите целое трехзначное число: ");
    int F=reader.nextInt();
    System.out.println((F%10)+" "+(F/10%10)+" "+(F/100));
  }
}