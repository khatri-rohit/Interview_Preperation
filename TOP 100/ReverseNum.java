class Reverse{

    public static int reverse(int n,int a){
        if(n == 0)
            return a;
        
        a = a * 10 + (n % 10);
        return reverse(n / 10, a);
    }
    
    public static void main(String args[]){
        int num = -1234, rev = 0;
        System.out.println(reverse(num,0));

        while(num != 0){
            int n = num % 10;
            rev = rev * 10 + n;
            num /= 10;
        }
 
        System.out.println(rev);
 
    }
}