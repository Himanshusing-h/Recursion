import java.util.*;

public class PrintSubset {
    public static void main(String[] args) {
        String word="abc";

        List<String> list=new ArrayList<String>();
        print("",word,0,list);
        System.out.println(list);

    }
 static void print(String str,String word,int ind,List<String> list){
//we are starting with empty string using pick or skip method
     //
        if(ind==word.length()){
if(str.length()!=0)list.add(str);
            return;
        }
     char ch=word.charAt(ind);
        print(str,word,ind+1,list);//skip
        print(str+ch,word,ind+1,list);//pick

    }
}
