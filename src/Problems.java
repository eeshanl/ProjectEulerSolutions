public class Problems {
	
	public int One_Sum3and5(int x) {
		int sum = 0;
		for (int i = 0; i < x; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		return sum;
	}
	

}
