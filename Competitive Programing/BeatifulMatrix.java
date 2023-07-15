import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BeatifulMatrix {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int linha=0;
        int coluna=0;

        for (int i = 0; i <5;i++){
            String[] line = reader.readLine().split(" ");
            
            for (int j = 0; j <5;j++){
                int num=Integer.parseInt(line[j]);
                if(num==1){
                    linha=i;
                    coluna=j;
                }
            }
        }
        int sum=0;
        if(linha<2) sum=sum+(2-linha);
        if(linha>2) sum=sum+(linha-2);
        if(coluna<2) sum=sum+(2-coluna);
        if(coluna>2) sum=sum+(coluna-2);
        
        System.out.println(sum);

    }
    
}
