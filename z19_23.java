class z19_23{
	public static boolean kolvopovtor(int[] massiv, int number) {
		int povtor=0;
		System.out.println(number);
		for (int i=0;i<=9;i++) {
			if (massiv[i]==number) return true;
		}
		return false;
	}
	public static void main(String[] args) {
		int [] a = new int[10]; 
		int b = 1+(int)(Math.random()*10);
		for (int i=0;i<=9;i++) {
			a[i]=1+(int)(Math.random()*10);
			System.out.print(a[i]+" ");
		}
		System.out.println();
		if (kolvopovtor(a, b) == true) System.out.println("Есть");
		else System.out.println("Нет");
	}
}