package calculator;

class StringCalculator {

	public int add(String input) {
		int sum = 0;
		String[] arr=input.	split(",");
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
		}else if(input.length()>=1) {
	    		return Integer.parseInt(input);
}
		 else {
	    		return 0;
}
	}
}
