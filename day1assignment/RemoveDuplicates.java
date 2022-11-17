package week3.day1assignment;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// Use the declared String text as input
		//String text = "We learn java basics as part of java sessions in java week1";		
	   String text = "We learn java basics as part of java sessions in java week1";
	int count=0;
	String[] split=text.split(" ");
	//Initialize an integer variable as count	
	for (int i = 0; i < split.length; i++) {
		//Split the String into array and iterate over it 
		for (int j = i+1; j < split.length; j++) {
			 //Initialize another loop to check whether the word is there in the array
			if(split[i].equals(j)) {
				//if it is available then increase and count by 1. 
				count=count+1;	
			}
		}
		//if the count > 1 then replace the word as "" 
		if(count>1) {
		text=text.replace(split[i], "");
		break;
		//Displaying the String without duplicate words
	}
	}
	System.out.println(text);
}
	}


