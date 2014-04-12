import java.util.*; 
class upak {
  static Scanner reader = new Scanner(System.in);
  public static void main(String[] args) {
    System.out.println("¬ведите строку");
    String s = "aaabbbbcccccc", s1;
    int i = 1, count=0;
    s = s+" "; 
    while (i<=s.length())
    {
      if (s[i] == s[i+1]) count++; 
      else{
      System.out.print(count+s[i]);
      count=0;
      } i++;
    }
    
  }
}