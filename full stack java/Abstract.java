abstract class Animal{
    public abstract void sound();
    public void sleep(){
        System.out.println("the animal is sleeping");
    }
}
class Dog extends Animal{
    public void sound(){
        System.out.println("the dog barks");
    }
}
class cat extends Animal{
    public void sound(){
        System.out.println("cat meow");
    }
}

public class Abstract{
public static void main( String[] args){
    Animal mydog = new Dog();
    Animal mycat = new cat();
    
    mydog.sound();
    mycat.sound();
    mydog.sleep();
    mycat.sleep();
    
    



    
}
}
