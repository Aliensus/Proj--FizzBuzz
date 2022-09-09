
public class FizzBuzz {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		
		for (int i = 1; i <= 100; i++) {
			a++;
			b++;
			if (a == 3 || b == 5) {
				if (a == 3) {
					System.out.print("Fizz");
					a = 0;
				}
				if (b == 5) {
					System.out.print("Buzz");
					b = 0;
				}
			}
			else System.out.print(i);
			
			System.out.println();
		}

	}

}
