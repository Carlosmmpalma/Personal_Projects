import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bitmaismais {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(reader.readLine());
        int count =0;
        for (int i=0; i<n; i++) {
            String[] s=reader.readLine().split("");

            if(s[0].compareTo("+")==0 || s[1].compareTo("+")==0 || s[2].compareTo("+")==0) count++;
            else count--;
        }
        System.out.println(count);

    }
    
}
