import java.util.Scanner;

// evens first then odds or vice versa


public class Permutations {

    public static void main(String xx[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if (n >1 && n <= 3) {
            System.out.print("NO SOLUTION");
            sc.close();
            return ;
        }
        
        for(int i=2; i<=n; i+=2){

                System.out.print(i);
                System.out.print(" ");

        }

        for(int i=1; i<=n; i+=2){

                System.out.print(i);
                if(i == n-1) continue;
                System.out.print(" ");

        }

        sc.close();
    }

}