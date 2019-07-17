public class pigLatinTranslator{

		public String translate(String word){
			int n=word.length();
			StringBuilder sb=new StringBuilder(word);
			
			if(word.charAt(0)=='a' || word.charAt(0)=='e' || word.charAt(0)=='i' || word.charAt(0)=='o' || word.charAt(0)=='u' || word.substring(0,2).equals("xr") || word.substring(0,2).equals("yt")){
				sb.append("ay");
			}else{
				
			}
	
		}












}