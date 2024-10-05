public class palindrome{
    public static void main(String[] args){
        int n;
        int sum=0;
        int r=121;
        while(r>0){
            n=r%10;
            sum=(sum*10)+n;
            r=r/10;
        }
        if(temp==sum){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}