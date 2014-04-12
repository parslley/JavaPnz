class z11_9 {
 public static void main(String[] args) {
   for (int i=1;i<=20;i++) {
    int x=27+(int)(Math.random()*(73-27+1));
    if (x%3==0) System.out.print(x+"# ");
    else System.out.print(x+" ");
   }
  } 
}