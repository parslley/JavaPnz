import java.util.*;
class z3_1
 {
  static Scanner reader = new Scanner(System.in);
  public static void main (String[] args)
  {
    System.out.println("������� ����������� �� ����������:");
    double F=reader.nextDouble();
    F-=32; F*=5; F/=9;
    System.out.println("����������� ����� "+F+" �� �������");
  }
}