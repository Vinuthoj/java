public class singlebird{
    void fly(){
        System.out.println("bird can fly");
    }
    class parot extends bird{
         void color(){
            System.out.println("green");
         }
    }
    public Static void main(String[] args){

    }
}
public class main(){
    public static void main(String[] args){
        parot p=new parot();
        p.color();
        p.fly();
    }
}
