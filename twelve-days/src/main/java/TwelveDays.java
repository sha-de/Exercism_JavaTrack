class TwelveDays {
	
	private final String[] counter=new String[]{"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth" };

	private final String[] gifts=new String[]{"a Partridge in a Pear Tree.\n", "two Turtle Doves", "three French Hens", "four Calling Birds", "five Gold Rings", "six Geese-a-Laying", "seven Swans-a-Swimming", "eight Maids-a-Milking", "nine Ladies Dancing", "ten Lords-a-Leaping", "eleven Pipers Piping", "twelve Drummers Drumming"};

    String verse(int verseNumber) {
		return verseNumber<1 || verseNumber >12 ? "": String.format("On the %1$s day of Christmas my true love gave to me: %2$s", counter[verseNumber-1], getSecond(verseNumber));
    }

    String verses(int startVerse, int endVerse) {
		StringBuilder sb=new StringBuilder();
		
		for(int i=startVerse; i<=endVerse;i++){
			sb.append(verse(i));
			if(i!=endVerse)
				sb.append("\n");
		}
		
		return sb.toString();
    }
    
    String sing() {
		return verses(1,12);
    }
	
	String getSecond(int vn){
		StringBuilder sb=new StringBuilder(gifts[0]);
		
		for(int i=1;i<vn;i++){
			if(i==1)
				sb.insert(0, "and ");
			
			sb.insert(0, gifts[i]+", ");
		}
		
		return sb.toString();
	}
}
