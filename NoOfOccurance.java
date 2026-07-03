public class NoOfOccurance {
    public static void main(String[] args) {
        System.out.println(occurance("character",'t',0,0));
    }
    //sochhhhh
    //hume kya kya chahiye
    //ek to string jisse check karenege;
    //ek to char jisme  char ko store karenge compare karenge ke liye
    //ek to index jo badhte rahega
    //ek to count jo no of occurance count karega
   static int occurance(String str,char ch,int ind,int count)
    {
        if(ind==str.length())return count;//base case
        char sh=str.charAt(ind);//character at index nikalana
        //abb do chize hongi ya to equal ya to not equal uske liye if else use kiya
        if(sh==ch)return occurance(str,ch,ind+1,count+1);
        else return occurance(str,ch,ind+1,count);
    }
}
