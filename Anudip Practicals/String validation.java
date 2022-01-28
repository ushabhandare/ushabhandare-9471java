import java.util.*;

public class StringValidation {
public static void main(String [] a) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a string pass of length 10: ");
	int count = 0, fail = 0;
	String s1 = sc.nextLine();
	sc.close();
	if (s1.length() < 10)
		System.out.println("--b +ve & enter req length string--");
	else {
		for(int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			if(Character.isLetter(ch))
				continue;
			else if(Character.isDigit(ch)) {
				count = count + 1;
				continue;
			}
			else {
				//System.out.println("Invalid password string");
				fail = 1;
				break;
			}
		}
		if(count < 2 | fail == 1)
			System.out.println("Invalid password string");
		else
		System.out.println("Valid password string");
	}
}
}
