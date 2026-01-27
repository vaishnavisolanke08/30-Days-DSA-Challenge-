public class ReverseNo {
    public static void main(String[] args) {
        int number = 12345;
        int rev = 0;

        while(number>0){
            int reminder = number % 10;
            rev = rev * 10 + reminder;
            number = number / 10; 
        }
        System.out.println(rev);
    }   
}
