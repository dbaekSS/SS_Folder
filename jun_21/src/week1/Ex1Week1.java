package week1;


public class Ex1Week1 {

	public static void main(String[] args) {
		FuncInterface isOdd = (i) -> i%2 == 1;
		
		FuncInterface isPrime = (i) -> {
			for(int j = 2; j < i/2; j++) {
				if(i % j == 0) {
					return false;
				}
			}
			return true;
		};
		
		FuncInterface isPalindrome = (i) -> {
			if(i < 10) {
				return true;
			}
			int rev = 0, remainder = 0, temp = i;
			while(temp != 0) {
				remainder = temp % 10;
				rev = rev * 10 + remainder;
				temp = temp / 10;
			}
			return (rev == i);	
		};
		
		System.out.println(isOdd.doMath(3) + " should be true");
		System.out.println(isOdd.doMath(4) + " should be false");
		System.out.println(isPrime.doMath(5) + " should be true");
		System.out.println(isPrime.doMath(12) + " should be false");
		System.out.println(isPalindrome.doMath(898) + " should be true");
		System.out.println(isPalindrome.doMath(539) + " should be false");
		System.out.println(isPalindrome.doMath(5) + " should be true");
		
	}

}
