class n10_6
{
  public static void main(String[] args)
  {
    int a=10+(int)(Math.random()*90);
    System.out.println(a);
    int b=a+(int)(Math.random()*(90-a)), c=a+(int)(Math.random()*(90-a)), d=a+(int)(Math.random()*(90-a));
    System.out.println("Получены числа: "+b+" "+c+" "+d);
  }
}