import java.util.*;
class z21_12 {
  public static Scanner reader = new Scanner(System.in);
  public static int Strokkk(String s, char c){
    int sch = 0;
    for (int i=0; i<s.length(); i++) if (s.charAt(i) == c) sch++;
  return sch;
  }
  public static void main(String [] args) {
    System.out.println("Введите строку:");
    String stroka = reader.next();
    char symb = 'm';
    System.out.println(Strokkk(stroka, symb));
  }
}
