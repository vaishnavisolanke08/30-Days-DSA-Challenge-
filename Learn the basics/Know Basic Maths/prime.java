public class prime {
    public static void main(String[] args) {
        int number = 5;
        int count = 0;

        for(int i= 1; i<= number; i++){
            if(number % i == 0){
                count++;
            }

            if (count == 2){
                System.out.println("it is prime");    
            }else{
                System.out.println("it is not prime");
            }
        }

    }
}
    

