import java.util.ArrayList;
import java.util.List;

//what we done
//list return krna tha to list bnaya
//ek string banaya kyuki uske hi to subsequence denge
//list ko print kiya
//sub naam ka method bnaya jo 4 chize leta
// pehle empty string jis subsequence store hoga
//dusra string itself
//tesra list
//foutha index starting which is zero ,from zero we will go to last index then stop
//using pick or skip technique
public class PrintSubsequence {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        String str="abc";
        sub("",str,list,0);
        System.out.println(list);
    }
    static void sub(String nstr,String str,List<String> list,int ind)
    {

        if(ind==str.length()){
            //we are adding in this because hume no of subsequence tree ke end mai hi millenge to isiliye wahi add krdo uper karoge to galat chize hongi


            list.add(nstr);
            return;
        }
        char ch=str.charAt(ind);
        //when return type is void use this
         sub(nstr+ch,str,list,ind+1);
        sub(nstr,str,list,ind+1);
        //when return type is something different
        //use this
//        return  sub(nstr+ch,str,list,ind+1);
//        return sub(nstr,str,list,ind+1);




    }
}

