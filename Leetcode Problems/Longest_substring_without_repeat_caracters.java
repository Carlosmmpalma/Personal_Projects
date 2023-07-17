import java.util.ArrayList;

public class Longest_substring_without_repeat_caracters {
    public static void main(String[] args) {
        
    }
    public int lengthOfLongestSubstring(String s) {
        int size=1;
        int count=1;
        ArrayList<Character> substrings =new ArrayList<>();
        for(int i=0;i< s.length();i++){
            if(i+1<s.length() && s.charAt(i)!=s.charAt(i+1)){
                count++;
            }else{
                if(count>size){
                    size=count;
                }
                count=1;
            }
        }
        return size;
    } 
}
