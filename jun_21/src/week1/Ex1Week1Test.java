package week1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ex1Week1Test {
	
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

	@Test
	void testIsOdd() {
		assertTrue(isOdd.doMath(3));
		assertFalse(isOdd.doMath(4));
	}
	
	@Test
	void testIsPrime() {
		assertTrue(isPrime.doMath(5));
		assertFalse(isPrime.doMath(12));
	}

	
	@Test
	void testIsPalindrome() {
		assertTrue(isPalindrome.doMath(5));
		assertTrue(isPalindrome.doMath(898));
		assertFalse(isPalindrome.doMath(539));
	}


}
