class person{
    private String name;
    private int Age;
//getter method
public String getName(){
    return name;
}
//settcter method
public void setName(String name){
    if(name!=null && name.is Empty()){
        this.name=name;
    }
    else{
        System.out.println("invalid name:"+name);
    }
}
public int getAge(){
    return age;
}
public void setage(int agw){
    if(age>0){
        this.age=age;
    }
    else{
        System.out.println("invalid age:"+age);
    }
}
public class Encapsulation{
    public static=new person();
    person.setName("sahil");
    person.setAge(20);
    System.out.print("Name:"+person.getName());
    System.out.print("Age:"+person.getAge());
    person.setAge(-5);

}
}