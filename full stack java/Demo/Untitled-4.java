
public static EXceptionExample{
    public static void main(String[] args){
        try{
            int a=10/0;
        }
        catch(ArithmeticException e){
            System.out.println("error Division by zero");
        }
    }
}
