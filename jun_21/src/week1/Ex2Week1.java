package week1;

public class Ex2Week1 {
	/* assignments 2-5 could be done using a stream as well and utilizing .filter or .map or .replaceAll*/
	//assignment 2
	public int[] rightDigit(int[] arr) {
		int[] res = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			res[i] = arr[i] % 10;
		}
		return res;
	}
	
	//assignment 3
	public int[] doubling(int[] arr) {
		int[] res = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			res[i] = arr[i] * 2;
		}
		return res;
	}
	
	
	//assignment 4
	public String[] noX(String[] arr) {
		String[] res = new String[arr.length];
		for(int i = 0; i < arr.length; i++) {
			res[i] = arr[i].replace("x", "");
		}
		return res;
	}
	
	public boolean groupSumClump(int start, int target, int[] arr) {
		 if(start >= arr.length) {
		        return false;
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
