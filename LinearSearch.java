public class LinearSearch {
    public static void main(String[] args) {
        int[]arr={2,5,4,7,8};
        int find=4;
//we are giving array and element to find and zero as a starting index

        boolean found= search(arr,find,0);
        System.out.println(found);
    }
    static boolean search(int[]arr,int find,int str)
    {
        //breaking statement or base statement
        //traversed but element not found;
        if (str==arr.length){
            return false;
        }
        //element found
        if (arr[str]==find ){
            return true;
        }
        // recursive call
      return search(arr,find,str+1);

    }
}
