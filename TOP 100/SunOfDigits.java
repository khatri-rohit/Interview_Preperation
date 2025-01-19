class DigitSum{

    static int sum = 0;

    static int getSum(int n){
        if(n == 0)
            return 0;
        sum += n % 10;   
        return  sum + getSum(n / 10);
    }
    
    public static void main(String args[]){
        int n = 450;

        // int sum = 0;
        // while(n != 0){
        //     sum += n % 10;
        //     n /= 10;
        // }
        
        getSum(n);
        System.out.println(sum);
    }
}