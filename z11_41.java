class z11_41
{
  public static void main(String[] args)
  {
    for (int i = 100; i<=999; i++)
    {
      int a = i/100, b = (i%100)/10, c = i%10;
      if (a%2==0 & b%2==0 & c%2==0) System.out.print(i+" ");
    }
  }
}