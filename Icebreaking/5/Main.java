import java.util.Scanner;
class Main{
    public static void main(String args[]){
        System.out.print("Input a number: ");
        int n = new Scanner(System.in).nextInt();
        for(int i = 1; i <=10; i++){
            System.out.println(n+" x "+ i +" = "+ (n*i));
        }
        

    }
}
