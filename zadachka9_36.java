import java.util.*;
class zadachka9_36
{
  static Scanner reader = new Scanner (System.in);
  public static void main(String[] args)
  {
    String s1 = reader.next();
    String s2 = reader.next();
    if (s1.equals(s2)) System.out.println("Тезки");
    else System.out.println("Не тезки");
  }
}