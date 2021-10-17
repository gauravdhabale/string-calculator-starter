package calculator;

class StringCalculator {

	public int add(String input) {
		int sum = 0;
		String[] arr=input.	split(",");
		// for string contains more than two numbers
		if(input.contains(";") && arr.length==2) {
    		for(int i=0; i<arr.length; i++) {
    			sum=sum+Integer.parseInt(arr[i]);
    		}
    		return sum;
		// if given string contains only two numbers
		} else if(input.contains(";") && arr.length==2) {
    		for(int i=0; i<arr.length; i++) {
    			sum=sum+Integer.parseInt(arr[i]);
    		}
    		return sum;
		}
		// for string contains only one number
		else if(input.length()>=1) {
	    		return Integer.parseInt(input);
}
		// if string is empty
		 else {
	    		return 0;
}
	}
}
