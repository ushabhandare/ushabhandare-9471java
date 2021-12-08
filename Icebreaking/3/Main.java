import java.util.Scanner;
class Main{
    public static void main(String args[]){
        System.out.print("Enter first number: ");
        int i = new Scanner(System.in).nextInt();
        System.out.print("Enter second number: ");
        int j = new Scanner(System.in).nextInt();
        System.out.println(i+" x "+ j +" = " +i*j);
    }
}
