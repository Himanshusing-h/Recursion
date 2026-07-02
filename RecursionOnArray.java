public class RecursionOnArray {
    public static void main(String[] args) {
        int[] arr={2,4,5,7,8};
        int n=arr.length;
        System.out.println("normal array");
        print(0,arr);
        System.out.println("reversed array");
        revprint(0,arr);

    }
    //we have created start ,end and arr if starting index is equal to ending index that mean we have traversed the array
    static void print(int str,int[]arr)
    {
        //breaking statement or base statement
        if (str==arr.length)return;
        //working
        System.out.println(arr[str]);
        //call
        print(str+1,arr);
    }
    //to reverse print

    static void revprint(int str,int[]arr)
    {
        //breaking statement or base statement
        if (str==arr.length)return;
        //call
        revprint(str+1,arr);
        //working
        System.out.println(arr[str]);
    }
}
