public class PrintSubset {
    public static void main(String[] args) {
        String word="abc";
        print("",word,0);
    }
 static void print(String str,String word,int ind){
//we are starting with empty string using pick or skip method
     //
        if(ind==word.length()){
            System.out.println(str);
            return;
        }
     char ch=word.charAt(ind);
        print(str,word,ind+1);//skip
        print(str+ch,word,ind+1);//pick

    }
}
