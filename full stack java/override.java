class Animal{
    public void sound(){
      System.out.println("animal make sound");
    }
}
class Dog extends Animal{
    public void sound(){
        System.out.println("the dog can bark");
    }
}
class Cat extends Animal{
    public void sound(){
        System.out.println("the cat can moves"); 
}
}
public class override{
    public static void main(String[] args){
      Animal myAnimal=new Animal();
      Animal myDog=new Dog();
      Animal myCat=new Cat();
      myAnimal.sound();
      myDog.sound();
      myCat.sound();
}
}
    