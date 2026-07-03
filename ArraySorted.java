public class ArraySorted {
    public static void main(String[] args) {
int[]arr={55,4,5,78,9};
int n=arr.length-1;
        System.out.println(sorted(arr,0));
    }
    //do chize li
    //ek to array jisme comparasion hoga
    //ek to index jo zeroth index se second last tkk jaega
    //kyu second last
    //kyuki hum ind+1 check kr rhe or agar last tkk jaega to last+1 pe error aaega
    //or jbb second last pe honge to last check ho jaega
  static   boolean sorted(int []arr,int ind)
    {
        //agar ind second last index tkk pahuch gya to means sorted
        if(ind==arr.length-2)return true;
        //checking sorted
        //agar abhi wala sorted hai to aage badho
        if(arr[ind]<arr[ind+1])return sorted(arr,ind+1);
        //agar nai to false return krdo kyuki aage jaane ki need hi nai
        else return false;
    }
}
