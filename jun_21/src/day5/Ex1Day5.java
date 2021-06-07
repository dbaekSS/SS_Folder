package day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex1Day5 {
 
	public static void main(String[] args) {
		Ex1Day5 temp = new Ex1Day5();
		//sort shortest to longest
		String[] strArr = {"john", "kim", "bob", "eddie"};
		Arrays.sort(strArr, (a, b) -> a.length() - b.length());
		System.out.println(Arrays.toString(strArr));
		
		//sort longest to shortest
		String[] strArr1 = {"john", "kim", "bob", "eddie"};
		Arrays.sort(strArr1, (a, b) -> b.length() - a.length());
		System.out.println(Arrays.toString(strArr1));
		
		//sort by 1st letter
		String[] strArr2 = {"john", "kim", "bob", "eddie"};
		Arrays.sort(strArr2, (a, b) -> a.charAt(0) - b.charAt(0));
		System.out.println(Arrays.toString(strArr2));
		
		//sort by if it has an e
		String[] strArr3 = {"johen", "kim", "bob", "eddie"};
		Arrays.sort(strArr3, (a, b) -> a.contains("e")? -1: 1);
		System.out.println(Arrays.toString(strArr3));
		
		//same as above but using a static method
		String[] strArr4 = {"johen", "kim", "bob", "eddie"};
		Arrays.sort(strArr4, (a, b) -> yourMethod(a,b));
		System.out.println(Arrays.toString(strArr4));
		
		//put o with numbers that are odd and e with numbers that are even
		int[] arr = {1, 13, 2, 24, 5};
		System.out.println(temp.oddEvenSort(arr));
		
		//only take strings starting with a and length of 3
		ArrayList<String> tempArr = new ArrayList<String>();
		tempArr.add("bob");
		tempArr.add("abc");
		tempArr.add("chungee");
		tempArr.add("adam");
		tempArr.add("aye");
		System.out.println(temp.aThree(tempArr).toString());
	}
	
	static int yourMethod(String s1, String s2) {
		if(s1.contains("e")) return -1;
		return 1;
	}
	
	static List<String> aThree(List<String> s1) {
		List<String> res = s1.stream().filter((s) -> (s.length() <= 3 && s.charAt(0) == 'a')).collect(Collectors.toList());
		return res;
	}
	
	public String oddEvenSort(int[] arr) {
		String s = "";
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				s += "e" + arr[i] + ",";
			} else {
				s += "o" + arr[i] + ",";
			}
		}
		return s;
	}
	
}
