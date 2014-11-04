package charfinder;

public class charfinder {

	public static void main(String[] args) {
		
		
		charfinder cf = new charfinder();
		
		String s = "Praktikum";
		
		System.out.println(" The first character of " + s + " is " + cf.getfirstChar(s));
		
		System.out.println(" The last character of " + s + " is " + cf.getLastChar(s));
		
		System.out.println(s + " length is " + s.length());
		
		cf.printAllCharPosition(s);
		
		cf.getCHarPos(s, 'k');
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
}
