import java.util.*;
class zadachka9_37
{
  static Scanner reader = new Scanner (System.in);
  public static void main(String[] args)
  {
    String sname1 = reader.next();
    String ssurname1 = reader.next();
    String sname2 = reader.next();
    String ssurname2 = reader.next();
    if (sname1.equals(sname2)) System.out.print("�����");
    else System.out.print("�� �����");
    if (ssurname1.equals(ssurname2)) System.out.print(", ������������");
    else System.out.print(", �� ������������");
  }
}