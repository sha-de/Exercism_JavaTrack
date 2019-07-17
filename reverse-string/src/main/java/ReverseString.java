class ReverseString {

    String reverse(String inputString) {
		
		StringBuilder sb=new StringBuilder(inputString);
		int left=0, right=inputString.length()-1;
		while(left<right){
			char c=sb.charAt(left);
			sb.setCharAt(left, sb.charAt(right));
			sb.setCharAt(right,c);
			
			left++;
			right--;
		}
		
		return sb.toString();
		
	}
  
}