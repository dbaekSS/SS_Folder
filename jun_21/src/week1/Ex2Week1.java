package week1;

import java.util.List;

public class Ex2Week1 {
	//assignment 2
	public List<Integer> rightDigit(List<Integer> arr) {
		arr.replaceAll(x -> x % 10);
		return arr;
	}

	//assignment 3
	public List<Integer> doubling(List<Integer> arr) {
		arr.replaceAll(x -> x * 2);
		return arr;
	}


	//assignment 4
	public List<String> noX(List<String> arr) {
		arr.replaceAll(s -> s.replace("x", ""));
		return arr;
	}

	public boolean groupSumClump(int start, int target, int[] arr) {
		if(start >= arr.length) {
			return target==0;
		}
		int i = start;
		int sum = 0;

		while(i < arr.length && arr[start] == arr[i]) {
			sum += arr[i];
			i++;
		}

		if(groupSumClump(i, target - sum, arr))
			return true;

		if(groupSumClump(i, target, arr))
			return true;

		return false;
	}

}
