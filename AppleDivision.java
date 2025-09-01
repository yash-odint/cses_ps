import java.io.*;
import java.util.*;

public class AppleDivision {
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

        int t = 1; 
        while (t-- > 0) {
            solve();
        }

        out.close();
    }

    static void solve() throws IOException {
        String s = nextLine();
        int[] freq = new int[26];
        for(int i=0; i<s.length(); i++) freq[s.charAt(i) - 'a']++;
        ArrayList<String> result = new ArrayList<>();
        fn(s, new StringBuilder(), freq, result);

        out.println(result.size());
        for(String str : result) out.println(str);

    }

    static void fn(String s, StringBuilder sb, int[] freq, ArrayList<String> result) throws IOException{
        
        if (sb.length() == s.length()) {
            result.add(sb.toString());
            return;
        }

        for (int j = 0; j < 26; j++) {
            if (freq[j] > 0) {
                sb.append((char)(j + 'a'));
                freq[j]--;
                fn(s, sb, freq, result);
                sb.deleteCharAt(sb.length() - 1);
                freq[j]++;
            }
            
        }

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


