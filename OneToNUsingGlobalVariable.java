import java.util.Scanner;

public class OneToNUsingGlobalVariable {
    //we are using static variable,so it can be used in print and therefore we have to pass only one variable in print
    static int n;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        n=sc.nextInt();
        print(1);
    }
    public static void print(int x){
        if(x>n)
        {
            return;
        }
        else {
            System.out.println(x);
            print(x+1);
        }
    }

}
