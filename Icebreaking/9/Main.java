import java.util.Scanner;
class Main{
    public static void main(String args[]){
        System.out.print("Enter word to be reversed: ");
        String word = new Scanner(System.in).next();
        int len = word.length();
        String reversedWord = "";
        for(int i = len-1; i >= 0; i--){
            reversedWord += word.charAt(i);
        }
        System.out.println(reversedWord);
    }
}
