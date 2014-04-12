class z12_13
{
  public static void main(String[] args)
  {
    int orel = 0, reshka = 0;
    for (int i = 1; i<=10; i++)
   {
     int moneta = 1+(int)(Math.random()*2);
     if (moneta == 1) reshka++;
     if (moneta == 2) orel++;
   }
    System.out.println("Орел выпал "+orel+" раз, а решка - "+reshka);
    int ar = Math.abs(orel-reshka);
    System.out.println("Абсолютная разница:"+ar);
    orel = 0; reshka = 0;
    for (int i = 1; i<=100; i++)
   {
     int moneta = 1+(int)(Math.random()*2);
     if (moneta == 1) reshka++;
     if (moneta == 2) orel++;
   }
    System.out.println("Орел выпал "+orel+" раз, а решка - "+reshka);
    ar = Math.abs(orel-reshka);
    System.out.println("Абсолютная разница:"+ar);
    orel = 0; reshka = 0;
    for (int i = 1; i<=1000; i++)
   {
     int moneta = 1+(int)(Math.random()*2);
     if (moneta == 1) reshka++;
     if (moneta == 2) orel++;
   }
    System.out.println("Орел выпал "+orel+" раз, а решка - "+reshka);
    ar = Math.abs(orel-reshka);
    System.out.println("Абсолютная разница:"+ar);
    orel = 0; reshka = 0;
  }
}