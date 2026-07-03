
public class CountAllSubsequence {
    public static void main(String[] args) {
        //what we are doing
        //same code of print subsequence
        //what change??
        //we dont have to return or print list soo not created list
        //instead of that passed count as it will count no of subsiquence at the end of the tree
        //if not understanding tree concept go through fibonacci question and recursion 2 notes


        String str="abcd";

        System.out.println(sub("",str,0,0));
    }



        static int sub(String nstr,String str,int count,int ind)
        {
            //if reach at end of tree count increased by 1;

            if(ind==str.length()){
           count++;
                return count;
            }
            //accessing ch
            char ch=str.charAt(ind);

            //when return type is something different
            //use this
            //adding pick and skip counts to get total no of counts
        return  sub(nstr+ch,str,count,ind+1)+sub(nstr,str,count,ind+1);




        }
    }


