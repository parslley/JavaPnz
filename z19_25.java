class z19_25{
	public static boolean sum(int[] massiv, int summa) {
		for (int i=0;i<=9;i++) {
			if (massiv[i]+massiv[i+1]==summa) return true;		
		}
		return false;
	}
	public static void main(String[] args) {
		int [] a = new int[11]; 
		int b = 1+(int)(Math.random()*20);
		System.out.println(b);
		for (int i=0;i<=9;i++) {
			a[i]=1+(int)(Math.random()*10);
			System.out.print(a[i]+" ");
		}
		System.out.println();
		if (sum(a, b) == true) System.out.println("Да");
		else System.out.println("Нет");
	}
}