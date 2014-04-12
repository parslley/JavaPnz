class z19_22{
	public static void kolvopovtor(int[] massiv, int number) {
		int povtor=0;
		for (int i=0;i<=9;i++) {
			if (massiv[i]==number) povtor++;
		}
		System.out.println(number);
		System.out.println("Кол-во повторов:"+povtor);
	}
	public static void main(String[] args) {
		int [] a = new int[10]; 
		int b = 1+(int)(Math.random()*10);
		for (int i=0;i<=9;i++) {
			a[i]=1+(int)(Math.random()*10);
			System.out.print(a[i]+" ");
		}
		System.out.println();
		kolvopovtor(a, b);
	}
}