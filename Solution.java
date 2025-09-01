import java.io.*;
import java.util.*;

public class Solution {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        boolean testing = false;
    
        if (testing) {
            br = new BufferedReader(new FileReader("./input.txt"));
            out = new PrintWriter(new BufferedWriter(new FileWriter("./output.txt")));
        } else{
            br = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
        }

        int t = nextInt(); 
        while (t-- > 0) {
            solve();
        }

        out.close();
    }

    static void solve() throws IOException {
        int n = nextInt();

        fn(1, 3, 2, n);


    }

    static void fn(int src, int dest, int helper, int n){
        if (n == 1) {
            out.println(src + " " + dest);
            return;
        }
        fn(src, helper, dest, n - 1);
        out.println(src + " " + dest);
        fn(helper, dest, src, n - 1);
    }
  
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


