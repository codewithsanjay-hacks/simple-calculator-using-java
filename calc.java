import java.util.Scanner;
class calc{
    public static void main(String[]args){
        Scanner read=new Scanner(System.in);
        System.out.println("enter the number");
        int num1=read.nextInt();
        System.out.println("enter the operator(+,-,*,/)");
        String oper=read.next();
        System.out.println("enter the 2nd number");
        int num2=read.nextInt();
        int result =0;
        switch(oper){
            case"+":
                result=num1+num2;
                System.out.println("result");
                break;
                 case"-":
                result=num1-num2;
                System.out.println("result");
                break;
                case"*":
                result=num1*num2;
                System.out.println("result");
                break;
                case"/":
                result=num1/num2;
                System.out.println("result");
                break;
                default:
        System.out.println("invalid program");
        break;
        read.close();
        
}
                
                
        }
    }