import java.util.Scanner;
class Main{
    public static void main(String args[]){
        System.out.print("Input first number: ");
        int n1 = new Scanner(System.in).nextInt();
        System.out.print("Input second number: ");
        int n2 = new Scanner(System.in).nextInt();
        System.out.print("Input third number: ");
        int n3 = new Scanner(System.in).nextInt();

        if(n1 > n2 && n1 > n3){
            System.out.println("Number "+n1+" is greatest of all..!!");
        }
        else if(n2 > n1 && n2 > n3){
            System.out.println("Number "+n2+" is greatest of all..!!");
        }
        else if(n3 > n1 && n3 > n2){
            System.out.println("Number "+n3+" is greatest of all..!!");
        }
        else{
            System.out.println("All nummbers are same..!!!");
        }
        

    }
}
