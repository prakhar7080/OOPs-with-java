class vehicle{
    void start(){
        System.out.println("Vehicle can start");
    }
}
class car extends vehicle{
    void drive(){
        System.out.println("We can drive car");
    }
}
class TurboCar extends car{
    void turbo(){
        System.out.println("Turbo car can be driven in turbo mode");
    }
}

class MultilevelInheritance{
    public static void main(String[] args){
        TurboCar obj1 = new TurboCar();
        obj1.turbo();
        obj1.drive();
        obj1.start();

        car obj2 = new car();
        obj2.drive();
        obj2.start();

        vehicle obj3 = new vehicle();
        obj3.start();
    }
}
