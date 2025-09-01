import java.io.*;
import java.util.*;

public class PalindromeReorder {
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
       
        String str = nextLine();

        int[] map = new int[26];

        for(int i=0; i<str.length(); i++){
            map[str.charAt(i) - 'A']++;
        }

        int countOdds = 0;
        
        for(int ch: map){
            if (ch%2==1) {
                countOdds++;
            }

            if (countOdds > 1) {
                out.println("NO SOLUTION");
                return;
            }
        }

        int odd = -1;

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<26; i++){
            if (map[i] % 2 == 1) {
                odd = i;
                continue;
            }

            char ch = (char) ((char)i + 'A');
            
            for(int k=0; k<map[i] / 2; k++){
                sb.append(ch);
            }
        }

        StringBuilder newSb = new StringBuilder(sb);
        sb.reverse();

        if (odd != -1) {
            char ch = (char) ((char)odd + 'A');
            for(int k=0; k<map[odd]; k++){
                newSb.append(ch);
            }
        }

        newSb.append(sb);

        out.println(newSb.toString());


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