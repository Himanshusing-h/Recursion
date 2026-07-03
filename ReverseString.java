public class ReverseString {
    public static void main(String[] args) {
     String str="himanshu";
     //str se copy ,empty string mai paste,kaha tkk jana uske liye length
        System.out.println(rev(str,"",str.length()-1));
    }

   static String rev(String str,String ne,int ind){
       //base case and ne mai humne store kiya new string ko
        if (str.length()==0)return ne;
        //hum last index ki value nikal rhe usko add kr de rhe new string mai or purani string ko kaat de rhe(substring use krke)
        char ch=str.charAt(ind);
        //substring mai second index mai jo index chahiye usse ek extra index likhte
       return rev(str.substring(0,ind),ne+ch,ind-1);
    }
}
