class z12_12
{
  public static void main(String[] args)
  {
    int z=0,v=0,l=0,o=0;
    for (int i = 1; i<=1234; i++)
   {
     int mes = 1+(int)(Math.random()*12);
     if (mes == 1 | mes == 2 | mes == 12) z++;
     if (mes == 3 | mes == 4 | mes == 5) v++;
     if (mes == 6 | mes == 7 | mes == 8) l++;
     if (mes == 9 | mes == 10 | mes == 11) o++;
   }
    System.out.println("Кол-во учеников родившихся зимой: "+z);
    System.out.println("Кол-во учеников родившихся весной: "+v);
    System.out.println("Кол-во учеников родившихся летом: "+l);
    System.out.println("Кол-во учеников родившихся осенью: "+o);
  }
}