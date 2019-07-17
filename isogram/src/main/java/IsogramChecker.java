import java.util.*;
class IsogramChecker {

    boolean isIsogram(String phrase) {
		
		phrase=phrase.toLowerCase();
		
		HashSet<Character> hs=new HashSet<>();
		
		for(int i=0;i<phrase.length();i++){
			char c=phrase.charAt(i);
			
			if(c=='-' || c==' ')
				continue;
			else{
				if(hs.contains(c))
					return false;
				hs.add(c);
			}
		}
		
		return true;
    }

}
