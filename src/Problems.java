public class Problems {
	
	/* If we list all the natural numbers below 10 that are multiples of 3 or 5,
	 * we get 3, 5, 6 and 9. The sum of these multiples is 23.
	 * 
	 * Find the sum of all the multiples of 3 or 5 below any number X
	 */
	public int One(int x) {
		int sum = 0;
		for (int i = 0; i < x; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		return sum;
	}
	
	/* Each new term in the Fibonacci sequence is generated by adding the previous two terms.
	 * By starting with 1 and 2, the first 10 terms will be: 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
	 * 2 + 8 + 34 
	 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
	 */
	public int Two() {
		int sum = 0;
		int x = 1;
		int y = 2;
		while (y < 4000000) {
			if (x % 2 == 0) sum += x;
			if (y % 2 == 0) sum += y;
			int temp = x + y;
			x = temp;
			y = temp + y;
		}
		return sum;
	}
	/* 2, 3
	 * 
	 */
}
