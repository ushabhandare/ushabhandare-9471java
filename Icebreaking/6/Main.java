import java.util.Scanner;
class Main{
    public static void main(String args[]){
        System.out.print("Input a number: ");
        int n = new Scanner(System.in).nextInt();
        if(n < 0){
            System.out.print("Number is negative");
        }
        else if(n==0){
            System.out.print("Number is not negative nor positive");
        }
        else{
            System.out.println("Number is positive");
        }
        

    }
}
