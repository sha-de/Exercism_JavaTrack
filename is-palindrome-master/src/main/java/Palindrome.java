public class Palindrome {
    public boolean check(String sentence) {
	
		int left=0;
		int right=sentence.length()-1;
		
		sentence=sentence.toLowerCase();
	
		while(left<right){
			
			if(!Character.isLetterOrDigit(sentence.charAt(left))){
				left++;
			}else if(!Character.isLetterOrDigit(sentence.charAt(right))){
				right--;
			}else{
				if(sentence.charAt(left)!=sentence.charAt(right))
					return false;
				left++;
				right--;
			}
		
		}
        return true;
    }
}