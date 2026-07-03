public class SumOfDigit {
    public static void main(String[] args) {
     int num=582;

        System.out.println(add(num,0));

    }
    //do number ko liya ek number itself or ek zero ,zero mai remainder add kiya or har iteration mai num ko divide kiya or jbb num equal to zero hua to return kr diya new
    static int add(int num,int ne){
        if(num==0)return ne;
       return add(num/10,ne+num%10);
    }
}
