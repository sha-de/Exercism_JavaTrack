import java.util.*;
public class Anagram{
	String str;
	
	public Anagram(String str){
		this.str=str;
	}

	public List<String> match(List<String> list){
		
		int len1=str.length();
		List<String> res=new ArrayList<>();
		
		
		for(int i=0;i<list.size();i++){
			
			int val=0;
			
			String s2=list.get(i);
			int len2=s2.length();
			
			if(len1!=len2)
			  continue;
			else{
					for(int x=0;x<str.length();x++){
						val^=(int)str.charAt(x);
						val^=(int)s2.charAt(x);
					}

				if(val==0)
					res.add(str);
				
			}
		
		
		}
		
		return res;
	
	
	}
	
}