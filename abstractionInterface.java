interface Animal{
    void eat();
    void sound();
}

class Cat implements Animal{
    public void eat(){
        System.out.println("Cat drinks milk");
    }
    public void sound(){
        System.out.println("Cat meow");
    }
}
class Dog implements Animal{
    public void eat(){
        System.out.println("Dog eats bones");
    }
    public void sound(){
        System.out.println("Dog barks");
    }
}

class abstractionInterface{
    public static void main(String[] args){
        Dog d = new Dog();
        d.eat();
        d.sound();

        Cat c = new Cat();
        c.eat();
        c.sound();
    }
}
