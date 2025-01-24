import java.util.*;

public class Harshad{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt(), tmp = num;
        int sum = 0;
        while(tmp != 0){
            sum += tmp % 10;
            tmp /= 10;
        }
        if(num % sum == 0)
            System.out.println("Is a Harshad");
        else 
            System.out.println("Is a not Harshad");
        // System.out.println(sum);
    }
}