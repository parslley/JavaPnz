class Z17_11{
	public static void main(String[] args) {
		int number = 10+(int)(Math.random()*100000-9);
		System.out.println(number);
		System.out.println(number_of_10(number));
	}
	public static int number_of_10(int number){
		int answer;
		for (int exp = 1; exp <= 5; exp++) if (number % (10*exp) => 1 & number % (10*exp)<=9) answer=exp+1;
		return answer;
	}
}