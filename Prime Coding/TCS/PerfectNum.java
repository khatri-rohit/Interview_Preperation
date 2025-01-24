import java.util.*;

public class PerfectNum {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);  
        int num = in.nextInt(), sum = 0;
        for(int i = 1; i < num; i++){
            if(num % i == 0)
                sum += i;
        }
        if(sum == num){
            System.out.println("Is a prefect number");
        } else
            System.out.println("Is not prefect number");
    }
}
