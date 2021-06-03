package day2;

public class Ex1Day2 {

	public static void main(String[] args) {
		Double totalSum = 0.0;
		for (String a : args) {
			boolean isNum = true;
			if(!(a == null)) {
				try {
					double argu = Double.parseDouble(a);
				} catch(NumberFormatException e) {
				//not a number
					isNum = false;
				}
				if(isNum) {
					totalSum += Double.parseDouble(a);
				}
			}
		}
		System.out.println(totalSum);
	}

}
