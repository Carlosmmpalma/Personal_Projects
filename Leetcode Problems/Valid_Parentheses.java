import java.util.ArrayList;

public class Valid_Parentheses {
    
    public boolean isValid(String s) {
        
        ArrayList<Character> arr=new ArrayList<>();
        boolean answer =true;
        int count=0;
        Character last;

        if(s.length()%2!=0 || s.charAt(0)!='{' && s.charAt(0)!='[' && s.charAt(0)!='(') return false;

        for(int i=0;i<s.length();i++){

            if(s.charAt(i)=='{' || s.charAt(i)=='(' || s.charAt(i)=='['){
                
                arr.add(s.charAt(i));
                count++;

            }else if(s.charAt(i)=='}'){

                if(arr.size()>0){

                last=arr.get(arr.size()-1);

                }else{

                    return false;
                }

                if(last!='{'){

                    return false;

                }else{

                    arr.remove(arr.size()-1);
                    count--;

                }
            }else if(s.charAt(i)==']'){

                if(arr.size()>0){

                last=arr.get(arr.size()-1);

                }else return false;


                if(last!='['){

                    return false;

                }else{

                    arr.remove(arr.size()-1);
                    count--;

                }
            }else if(s.charAt(i)==')'){

                if(arr.size()>0){

                last=arr.get(arr.size()-1);

                }else return false;


                if(last!='('){

                    return false;

                }else{

                    arr.remove(arr.size()-1);
                    count--;

                }
            }
            }

            if(count!=0) return false;

        return answer;
    }
}
