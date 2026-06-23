import java.util.Scanner;

public class AraiseToB {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int a=sc.nextInt();
        System.out.println("enter power");
        int b=sc.nextInt();
        System.out.println( power(a,b));
    }
    public static int power(int num,int pow)
    //we are changing power from pow to zero and multiplying num,as then we can get num*nnum*num
            //upto the no of power and when power is zero returing the ans
    {
    //O(b) time complexity
//        if(pow==0)return 1;
//        return num *power(num,pow-1);


        //log time complexity
        //base condition
        if(pow==0){
            return 1;
        }
        //if pow is ever applying formula
        //a to the power b=a to the power b/2 * a to the power b/2
        //we cant call two times same function
//        if((pow%2)==0){
//
//            return power(num,(pow/2))*(num,(pow/2));
//        }
//        //if pow is odd applying formula
//        //a to the power b =a * a to the power b/2 * a to the power b/2;
//        else {
//            return num*power(num,(pow/2))*power(num,(pow/2));
//        }
        //good approach
        int call=power(num,pow/2);
        if(pow%2==0) return call*call;
        else return num* call*call;
  }
    }

