public class Operations {
    int num1,num2;
    Operations(float a, float b, String operator){
        num1= (int) a;
        num2= (int) b;
    }
    public void operate(float a,float b,char op){
        if(op == '+'){
            int sum= (int) (a+b);
            System.out.println("Sum of two numbers:"+sum);
        }
        else if(op == '-'){
            int sub= (int) (a-b);
            System.out.println("Subtraction of two numbers:"+sub);
        }
        else if(op == '*'){
            int mult= (int) (a+b);
            System.out.println("Multiplication of two numbers:"+mult);
        }
        else if(op == '/'){
            int div= (int) (a+b);
            System.out.println("Division of two numbers:"+div);
        }
    }
}
