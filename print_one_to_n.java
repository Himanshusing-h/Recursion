import java.util.Scanner;

public class print_one_to_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        //taking number input
        int num = sc.nextInt();
        //calling function
        //taking two variable as starting and ending point
        print(1,num);
    }


    public static void print(int fir,int n)
    {

        //loop breaking statement(since we want upto one only)
        //if starting point is greater than end point break the loop
        if(fir>n){
            return;
        }
        //recuring statement
        else {
            //else call the function with fir+1;
            System.out.println(fir);
            //updation
            print(fir+1,n);
        }
        //it also having three part;
        //intializing print(num)
        //condition (n==0)
        //updation print(n-1)
    }
}



