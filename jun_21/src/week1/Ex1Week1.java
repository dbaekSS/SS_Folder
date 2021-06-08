package week1;

import java.util.Scanner;

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

		Scanner in = new Scanner(System.in);
		System.out.println("# of test cases?");

		String s = in.nextLine();
		int numOfTest = Integer.parseInt(s); //can do if statement to toss in exception handling for non-int

		for(int i = 0; i < numOfTest; i++) {
			System.out.println("test number and number?");
			String[] numArr = in.nextLine().split(" ");
			int testNum = Integer.parseInt(numArr[0]); //could do try catch to see if input is not int
			int num = Integer.parseInt(numArr[1]);
			switch (testNum) {
			case 1:
				if(isOdd.doMath(num)) {
					System.out.println("ODD");
				} else {
					System.out.println("EVEN");
				}
				break;
			case 2:
				if(isPrime.doMath(num)) {
					System.out.println("PRIME");
				} else {
					System.out.println("COMPOSITE");
				}
				break;
			case 3:
				if(isPalindrome.doMath(num)) {
					System.out.println("PALINDROME");
				} else {
					System.out.println("NOT PALINDROME");
				}
				break; //could add a finally for an error exception handler
			}
		}
		in.close();

		/*System.out.println(isOdd.doMath(3) + " should be true");
		System.out.println(isOdd.doMath(4) + " should be false");
		System.out.println(isPrime.doMath(5) + " should be true");
		System.out.println(isPrime.doMath(12) + " should be false");
		System.out.println(isPalindrome.doMath(898) + " should be true");
		System.out.println(isPalindrome.doMath(539) + " should be false");
		System.out.println(isPalindrome.doMath(5) + " should be true");*/

	}

}
