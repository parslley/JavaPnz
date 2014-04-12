class z16_14
{
  public static void main(String[] args)
  {
    int k1=0, sum=0;
    for (int i = 10; i<99; i++)
    {
      int k=0;
      for (int a = 1; a<=i; a++)
      {
        if (i%a==0) k++;
      }
      if (k==2) 
      {
        System.out.print(i+" ");
        k1++; sum=sum+i;
      }
    }
    System.out.println();
    System.out.println("Кол-во чисел: "+k1);
    System.out.println("Сумма чисел: "+sum);
  }
}