class Orel_reshka {
	public static void brosok(int n){
		int k_orel = 0, k_reshka = 0;
		for (int i = 1; i<=n; i++) {
			int moneta = (int)Math.round(Math.random());
			if (moneta==0) k_orel++;
				else k_reshka++;
		}
		System.out.println("Орел - "+k_orel+"Решка - "+k_reshka);
		System.out.println("Аб. знач. разн. - "+Math.abs(k_orel-k_reshka));
	}
	public static void main(String[] args) {
		brosok(10);
		brosok(100);
		brosok(1000);
	}
	
}