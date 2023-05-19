
public class NoOfVowelCount {

	public static void main(String[] args) {
		int wordCount = 0 ;
		
		int vowelCount = 0;
		
		
		String str1= "The Quick Browun Fox Jumped Over A Lazy Dog";
		String str  =	str1.toLowerCase() ; 
		
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			switch(c){
			case ' ':
			case '.':
				wordCount++;
			}
			switch(c){
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			
				vowelCount++;
			
			}
			
		}
		
		
		for(char c='a';c<'z';c++) {
			int frequencyCount= 0;
			for(int i=0;i<str.length();i++) {
				
				if(c==str.charAt(i)) {
					frequencyCount++;
				}
			
		 }
			System.out.println("The character "+c+" is "+frequencyCount+" times ");
		}
		System.out.println("there are "+(str.length()-wordCount)+" charcter in sentence ");
		//System.out.println("there are "+vowelCount +"number of vowels in sentence");
		System.out.println("there are "+vowelCount +" number of vowels in sentence");
	}

}