class z13_12
{
  public static void main(String[] args)
  {
    double sa1 = 0, sa = 0;
    int p = 0;
    for (int i = 1; i<=30; i++)
    {
      int o = 1+(int)(Math.random()*5); 
      if (o == 2) p++;
      sa1 = sa1+o;
      System.out.print(o+" ");
    }
    sa = sa1/30;
    System.out.println();
    System.out.println("Среднее арифметическое: "+sa);
    System.out.println("Кол-во плохих оценок: "+p);  
  }
}