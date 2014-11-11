package charfinder;

public class charfinder {

	public static void main(String[] args) {
		
		
		charfinder cf = new charfinder();
		
		String s = "Praktikum";
		
		System.out.println(" The first character of " + s + " is " + cf.getfirstChar(s));
		
		System.out.println(" The last character of " + s + " is " + cf.getLastChar(s));
		
		System.out.println(s + " length is " + s.length());
		
		//cf.printAllCharPosition(s);
		
		//cf.getCharPos(s, 'k');
		
		//cf.countCharOccAlaForLoop(s, 'k');
		
		cf.countCharOccAlaWhileLoop(s, 'k');
		
	
	}

	Character getfirstChar(String s){
		
		Character ch = s.charAt(0);
		
		
		return ch;
	}
	
	Character getLastChar(String s){
		
		Character ch = s.charAt(s.length() - 1);
		
		return ch;
	}
	
	void printAllCharPosition(String s){
		
		
		Integer currentPosition = 0;
		Integer lastPosition = s.length() - 1;
		
		while(currentPosition <= lastPosition){
		
		currentPosition++;	
			
			System.out.println(s.charAt(currentPosition)+ " is at position " + currentPosition);
		}
	}
	
	void getCharPos(String s, Character tofind){
		
		Integer currentPosition = 0;
		Integer lastPosition = s.length() - 1;
		
		Boolean found =false;
		
		while(currentPosition <= lastPosition){
			
			if(s.charAt(currentPosition) == tofind){
				
				System.out.println(tofind + " is at position "+currentPosition+ " of " + s);
				
				found = true;
			}
			
			currentPosition++;
		}
		 
		if (found == false){
			
			System.out.println(tofind+ " was not found ");
		}
	}
	
	void countCharOccAlaForLoop(String s, Character tofind){
		
		s= s.toLowerCase();
		
		// for(Initialisierung, Abbruch Bedingung, i++)
		
		Integer stringLength = s.length();
		Integer charOcc = 0;
		
		for(Integer i=0; i < stringLength; i++){
		
			if(s.charAt(i) != tofind){
				continue;
			} else{
				charOcc++;
			}
		}
			if (charOcc == 0){
				System.out.print(" ' "+tofind+" ' was not found in "+ s);
			}else{ 
				if(charOcc == 1){
					System.out.println("There is" + charOcc+ "occurence of" + tofind + "in" + s);
				}else{
					System.out.println("There are " + charOcc + "occurences of" + tofind + "in" + s);
				}
			}
		}
			void countCharOccAlaWhileLoop(String s, Character tofind){
				
				s= s.toLowerCase();
				
				Integer currentPosition = 0;
				Integer charOcc = 0;
				
				while(currentPosition<=s.length()){
				
					if(s.charAt(currentPosition) != tofind){
						
						currentPosition ++;
						
						continue;
						
					}else{
						
						charOcc++;
						currentPosition++;
					}
					if (charOcc == 0){
						System.out.print(" ' "+tofind+" ' was not found in "+ s);
					}else{ 
						if(charOcc == 1){
							System.out.println("There is " + charOcc+ "occurence of " + tofind + " in " + s);
						}else{
							System.out.println("There are " + charOcc + "occurences of " + tofind + " in " + s);
						}
				}
			}
}

}

