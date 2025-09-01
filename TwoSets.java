import java.io.*;
import java.util.*;

public class TwoSets {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        boolean testing = false;
        // File I/O setup for competitive programming
    
        if (testing) {
            br = new BufferedReader(new FileReader("./input.txt"));
            out = new PrintWriter(new BufferedWriter(new FileWriter("./output.txt")));
        } else{
            br = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
        }

        int t = 1; // number of test cases
        while (t-- > 0) {
            solve();
        }

        out.close(); // don't forget to flush and close the writer
    }

    static void solve() throws IOException {
        // Your solution logic here
       
        int n = nextInt();

        long sum = n * (n+1)/2;

        if (sum % 2 != 0) {
            out.println("NO");
            return;
        }

        long sum1 = 0;
        long sum2 = 0;
        ArrayList<Long> ls1 = new ArrayList<>();
        ArrayList<Long> ls2 = new ArrayList<>();

        for(long i=n; i>=1; i--){
            if (sum1 < sum2) {
                sum1 += i;
                ls1.add(i);
            } else{
                sum2 += i;
                ls2.add(i);
            }
        }

        if (sum1 == sum2) {
            out.println("YES");
            out.println(ls1.size());
            for(long num: ls1) out.print(num + " ");
            out.println();
            out.println(ls2.size());
            for(long num: ls2) out.print(num + " ");
            out.println();
        } else{
            out.println("NO");
        }

    }
    // Utility methods for fast input
    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            String line = br.readLine();
            if (line == null) return null;
            st = new StringTokenizer(line);
        }
        return st.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    static long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }

    static String nextLine() throws IOException {
        return br.readLine();
    }
}