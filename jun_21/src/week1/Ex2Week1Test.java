package week1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class Ex2Week1Test {

	Ex2Week1 x = new Ex2Week1();
	
	@Test
	void testRightDigit() {
		ArrayList<Integer> testArr = new ArrayList<Integer>();
		testArr.add(13);
		testArr.add(131);
		testArr.add(5);
		testArr.add(5132);
		List<Integer> rDig = x.rightDigit(testArr);
		int temp = rDig.get(0);
		assertEquals(temp, 3);
		temp = rDig.get(1);
		assertEquals(temp, 1);
		temp = rDig.get(2);
		assertEquals(temp, 5);
		temp = rDig.get(3);
		assertEquals(temp, 2);
	}
	
	@Test
	void testDoubling() {
		ArrayList<Integer> testArr = new ArrayList<Integer>();
		testArr.add(13);
		testArr.add(2);
		testArr.add(22);
		testArr.add(32);
		List<Integer> rDig = x.doubling(testArr);
		int temp = rDig.get(0);
		assertEquals(temp, 26);
		temp = rDig.get(1);
		assertEquals(temp, 4);
		temp = rDig.get(2);
		assertEquals(temp, 44);
		temp = rDig.get(3);
		assertEquals(temp, 64);
	}
	
	@Test
	void testNoX() {
		ArrayList<String> testArr = new ArrayList<String>();
		testArr.add("moxxie");
		testArr.add("xxxx");
		testArr.add("joe");
		testArr.add("xenox");
		List<String> arrNoX = x.noX(testArr);
		assertTrue(arrNoX.get(0).equals("moie"));
		assertTrue(arrNoX.get(1).equals(""));
		assertTrue(arrNoX.get(2).equals("joe"));
		assertTrue(arrNoX.get(3).equals("eno"));
	}
	
	@Test
	void testGroupSumClump() {
		int start = 0;
		int[] arr = {2, 4, 8};
		int target = 10;
		assertTrue(x.groupSumClump(start, target, arr));

		start = 0;
		int[] arr2 = {2, 4, 4, 8};
		target = 14;
		assertFalse(x.groupSumClump(start, target, arr2));
	}


}
