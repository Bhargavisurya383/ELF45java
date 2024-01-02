package Interview_Questions;

public class RangeOfPrime {
	public static void main(String[] args) {

		for (int i = 1; i <= 200; i++) {
			int count = 0;
			for (int j = 2; j <= 10; j++) {
				if (i % j == 0) {
					count++;
				}
			}
				if (count == 0) {
					System.out.println(i);
				}
			}
		}

	}

