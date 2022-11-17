package week3.day1assignment;

public class Palindrome {

	public static void main(String[] args) {
		///Build a logic to find the given string is palindrome or not
	   //Declare A String value as"madam"
		//Declare another String rev value as ""
		 //Iterate over the String in reverse order
		 //Add the char into rev
		 //Compare the original String with the reversed String, if it is same then print palinDrome 
		 //Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		String value="madam";
		String value1 ="";
		for(int i=value.length()-1;i>=0;i--){
			
			value1 = value1 + value.charAt(i);
		}
			if(value.equals(value1)) {
				System.out.println("palindrome");
			}
			else {
				System.out.println("not a palindrome");
			}
	}
}


