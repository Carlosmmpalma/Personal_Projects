import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Watermelon{
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(reader.readLine());

        if(num<1 || num>100) throw new IOException();

        if(num==2){
            System.out.print("NO");
        }else if(num%2==0){
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }
    }
}