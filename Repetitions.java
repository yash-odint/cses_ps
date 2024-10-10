import java.util.Scanner;

public class Repetitions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        int rep = 1;
        int maxRep = 1;
        for(int i=1; i<n; i++){
            if(s.charAt(i-1) == s.charAt(i)){
                rep++;
                maxRep = Math.max(maxRep, rep);
            } else{
                rep = 1;
            }
        }
        System.out.println(maxRep);
    }
}
