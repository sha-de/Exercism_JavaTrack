class Acronym {

String phrase;

    Acronym(String phrase) {
		this.phrase=phrase;
    }

    String get() {
		String res="";
		int flag=0;
		
		for(int i=0;i<phrase.length();i++){
			char c=phrase.charAt(i);
			if(flag==0 && Character.isAlphabetic(c)){
				res+=c;
				flag=1;
			}else if(!Character.isAlphabetic(c) && c!='\''){
				flag=0;
			}
			
		}
	
		res=res.toUpperCase();
		return res;
    }

}
