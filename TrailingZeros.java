import java.io.*;
import java.util.*;

// learn to use modulo


public class TrailingZeros {
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

        long ans = 0;

        for(long i=5; i<= n; i*=5) ans += n / i;
        
        out.println(ans);

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