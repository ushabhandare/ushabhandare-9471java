class Main{
    public static void main(String args[]){
        int i = 20;
        while(i >= 0){
            if(i == 7 || i == 15){
                i--;
                continue;            
            }
            System.out.println("Value of i: "+ i);
            i--;
        }
    }
}
