import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SixFlaredUp {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length();) {
            int j = i;
            int cnt = 0;
            while (j < s.length() && s.charAt(j) == '6') {
                cnt++;
                j++;
            }
            if (cnt > 9) {
                sb.append("27");
                i += cnt;
            } else if (cnt > 3) {
                sb.append("9");
                i += cnt;
            } else {
                sb.append(s.charAt(i));
                i++;
            }
        }
        System.out.println(sb.toString());
    }
}