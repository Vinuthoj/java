import java.util.Scanner;
public class caluclater{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        int a=sc.nextInt();
        System.out.println("enter the second number");
        int b=sc.nextInt();
        int c;
        System.out.println("enter your choice");
        int ch=sc.nextInt();
        switch(ch){
            case 1:
               c=a+b;
               System.out.println("c="+c);
               break;
            case 2:
                c=a-b;
                System.out.println("c="+c);
               break;
            case 3:
                c=a*b;
                System.out.println("c="+c);
               break;
        }
    }
}