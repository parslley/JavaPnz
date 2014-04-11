import java.util.*;
class z21_121{
  static Scanner reader = new Scanner(System.in);
  public static void main(String [] args) {
    int kolvo = 0;
    for (int i=1; i<=15; i++){
      int sch = 0;
      String im = reader.next();
      String fam = reader.next();
      for (int j=0; j<fam.length(); j++) if (im.charAt(0) == fam.charAt(j)) sch++;
      if (sch > 1) System.out.println(sch);
}
}
}
