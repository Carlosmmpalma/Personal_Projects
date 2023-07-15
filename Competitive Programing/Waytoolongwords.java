import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Waytoolongwords {
    public static void main(String argv[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> words = new ArrayList<String>();
        ArrayList<String> finale = new ArrayList<String>();

        int n=Integer.parseInt(reader.readLine());

        if(n<1|| n>100) throw new IOException();

        for (int i=0; i<n; i++) {
            String word = reader.readLine();
            words.add(word);
        }

        for (int i=0; i<words.size(); i++) {
            String word = words.get(i);
            if(word.length()>10){
            finale.add(word.substring(0,1)+(word.length()-2)+word.substring(word.length()-1,word.length()));
            }else{
                finale.add(word);
            }
        }

        for (int i=0; i<finale.size();i++){
            System.out.println(finale.get(i));
        }
    }
}
