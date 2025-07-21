// Combinations, Math, Long
// Learning - Counting, Int overflow, observation

import java.util.Scanner;

public class TwoKnights {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            System.out.println(solution(i));
        }
        sc.close();
    }

    public static long solution(int k){
        long totalWays = ((k*k) * (k*k - 1l))/2;
        long badWays = (k-2l) * (k-1) * 2 * 2;
        return totalWays - badWays;
    } 
}
