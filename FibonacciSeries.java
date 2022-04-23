package week1.day1;

public class FibonacciSeries {
	public static void main(String[] args) {
		// To find the fibonacci series for a given range
		int x = 8, firstNum = 0, secNum = 1, sum;
		for (int i =1; i <=x; i++) {
			System.out.println(firstNum);
		sum = firstNum + secNum;
		firstNum = secNum;
		secNum = sum;
	}

}
}