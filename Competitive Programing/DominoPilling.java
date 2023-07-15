import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DominoPilling {
    public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] line=reader.readLine().split(" ");
        int m=Integer.parseInt(line[0]);
        int n=Integer.parseInt(line[1]);

        int result=(m*n)/2;
        System.out.println(result);
    }
    
}
