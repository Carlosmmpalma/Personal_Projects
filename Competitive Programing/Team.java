import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Team {
public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int n=Integer.parseInt(reader.readLine());
    if(n<1||n>1000) throw new IOException();

    int m=0;

    for(int i=0;i<n;i++){
        int indice=0;
        int sum=0;
        String[] array=reader.readLine().split(" ");
        while(indice<3){
            sum=sum+Integer.parseInt(array[indice]);
            indice++;
        }
        if(sum>=2) m++;
        
    }

    System.out.println(m);
}
}
