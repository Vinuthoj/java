

public class MultipleCatchBlock {
    public static void main(String[] args)
    {

      try
      {
        int arr[]=new int[-5];
        arr[1]=30;

     }
    catch(ArithmeticException e)
    {
        System.out.println("ArithmeticException divible by zero");
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
        System.out.println("ArrayIndexOutofBoundsException:array index out of bound");
    }
    finaly
    {
        System.out.println("Exception:some other exception occured");
    }
        System.out.println("rest of the code");
    }
}

