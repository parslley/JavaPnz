class z16_5
{
  public static void main(String[] args)
  {
    for (int i=2; i<=10; i++)
    {
      for (int n=10; n<=99; n++)
      {
        if (n%i==0) System.out.print(n+" ");
      }
      System.out.println();
    }
  }
}