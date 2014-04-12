class z19_24{
	public static boolean plus(int[] massiv) {
		for (int i=0;i<=9;i++) {
			if (massiv[i]<0) return false;		}
		return true;
	}
	public static void main(String[] args) {
		int [] a = new int[10]; 
		for (int i=0;i<=9;i++) {
			a[i]=(-10)+(int)(Math.random()*21);
			System.out.print(a[i]+" ");
		}
		System.out.println();
		if (plus(a) == true) System.out.println("Да");
		else System.out.println("Нет");
	}
}