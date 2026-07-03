public class revision {
    int gcd=1;
    public static void main(String[] args) {
       // int num=451;
        System.out.println(reverse(6,4,1,1));
    }
    static int reverse(int n,int ne,int div,int gcd)
    {

        if(div>n ||div>ne)return gcd;
     if (n/div==0 && ne/div==0)
     {
         gcd=div;
     }
     return reverse(n,ne,div+1,gcd);


    }
}
