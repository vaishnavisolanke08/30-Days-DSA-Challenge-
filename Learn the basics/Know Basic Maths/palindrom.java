public class palindrom {
    public static void main (String[]args ){
        int number = 12345;
        int original = number ;
        int rev = 0;

        while(number>0){
            int digit = number % 10 ;
            rev = rev * 10 + digit;
            number = number /10;
        }
        if(original == rev){
            System.out.println("it is palindrom");
        }else{
            System.out.println("it is not palindrom");
        }
    }
    
}
