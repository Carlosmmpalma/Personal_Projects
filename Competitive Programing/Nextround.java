import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Nextround {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] line=reader.readLine().split(" ");
        int k=Integer.parseInt(line[1]); //Nuber of the participant


        String[] array=reader.readLine().split(" ");

        int num=Integer.parseInt(array[k-1]);
        int count=0;
        for(int i=0; i<array.length; i++){
            int value=Integer.parseInt(array[i]);
            if(value>0 && value>=num) count++;
        }
        System.out.println(count);
        
    }
}
