import java.util.Arrays;
import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        solution2();
    }

    public static void solution2(){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum = n*(n+1)/2;
        for (int i = 0; i < n-1; i++) {
            sum -= sc.nextLong();
        }
        System.out.println(sum);
    }

    public static void solution1(){
        // tle
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n-1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=1; i<n; i++){
            if(arr[i-1] != i){
                System.out.println(i);
                return;
            }
        }
        System.out.println(n);
    }
}
