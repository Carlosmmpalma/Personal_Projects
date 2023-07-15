import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PetyaandStrings {
    public static void main(String[] args) throws IOException {
    BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

    String first= reader.readLine();
    String second= reader.readLine();

    int value=first.compareToIgnoreCase(second);

    if(value==0) System.out.println("0");
    else if(value<0) System.out.println("-1");
    else System.out.println("1");

    }
}
