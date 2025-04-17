import java.util.Scanner;

public class NumberSpiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            System.out.println(solution(i, j));
        }
    }

    static int solution(int i, int j){
        int maxN = i;
        boolean isImax = true;
        if (j > i) {
            maxN = j;
            isImax = false;
        }

        int start = (maxN-1)*(maxN-1)+1;
        int end = maxN*maxN;

        if(isImax){
            if(maxN % 2 == 0){
                return end - j + 1;
            } else{
                return start + j - 1;
            }
        } else{
            if(maxN % 2 == 0){
                return start + i - 1;
            } else{
                return end - i + 1;
            }
        }
    }
}