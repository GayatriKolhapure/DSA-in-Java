public class SumOfDigitsInNumber {
    public static int sumOfDigits(int num){
        int sum=0;
        while(num > 0){
            int LD = num%10;
            sum += LD;
            num /= 10;
        }
        return sum;
    }



    public static void main(String[] args) {
        System.out.println(sumOfDigits(1234567890));
    }
}
