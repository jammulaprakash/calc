import java.util.Scanner;
public class Calculator {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String operator;
        System.out.println("Enter the operation you want to perform:");
        operator=sc.next();
        Operations operation=new Operations(8,7,operator);
    }
}
