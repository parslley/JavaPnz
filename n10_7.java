class n10_7
{
  public static void main(String[] args)
  {
    int a1=10+(int)(Math.random()*90), a2=a1+(int)(Math.random()*(90-a1)), s=a2-a1;
    System.out.println("������������� �����: "+a1+" "+a2+" ����� ���������: "+s);
    int b=a1+(int)(Math.random()*(s)), c=a1+(int)(Math.random()*(s)), d=a1+(int)(Math.random()*(s));
    System.out.println("�������� �����: "+b+" "+c+" "+d);
  }
}