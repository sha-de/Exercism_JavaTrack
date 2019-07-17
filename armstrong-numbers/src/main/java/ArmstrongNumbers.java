class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {
		
		int len=0, sum=0, rem=0;
		int temp=numberToCheck;
		int res=numberToCheck;
		while(temp!=0){
			len++;
			temp/=10;
		}
		
		while(numberToCheck>0){
			rem=numberToCheck%10;
			sum+= Math.pow(rem, len);
			numberToCheck/=10;
		}
		
		return res==sum?true:false; 
		
		
	}

}
