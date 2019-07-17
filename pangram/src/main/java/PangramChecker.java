import java.util.*;
public class PangramChecker {

    public boolean isPangram(String input) {
		
		//int[] fmap=new int[26];
		input=input.toLowerCase();
		
		HashSet<Character> hs=new HashSet<>();
		
		for(int i=0;i<input.length();i++){
			
			char c=input.charAt(i);
			
			if(c>='a' && c<='z')
			   hs.add(c);
		   
		}
		
		return hs.size()==26?true:false;
		
    }

}
