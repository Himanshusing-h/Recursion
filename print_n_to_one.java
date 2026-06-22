import java.util.Scanner;

public class print_n_to_one {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        //taking number input
        int num= sc.nextInt();
        //calling function
        print(num);
    }

    public static void print(int n)
    {
        //loop breaking statement(since we want upto one only)
        if(n==0){
            return;
        }
        //recuring statement
        else {
            System.out.println(n);
            //updation
            print(n-1);
        }
        //it also having three part;
        //intializing print(num)
        //condition (n==0)
        //updation print(n-1)
    }
}
