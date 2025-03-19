package ex1;
import java.util.Scanner;

public class Hello2 { 
	public static void main (String[]args) {
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		String word = "hi";
		if(number == 1){
			word = "Hello World 1!";
		} else {
			if(number == 2){
				word = "Hello World 2!";
			}
		}	
		
		System.out.println(word);		//what will happen if number is neither equal to 1 nor 2 ?
		s.close();

	}
}