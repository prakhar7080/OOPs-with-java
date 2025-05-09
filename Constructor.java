class car{
    String ModelName;
    String color;
    int year;
    car(){
        ModelName = "Unknown";
        color = "Unknown";
        year = 2000;
    }
    car(String ModelName, String color, int year){
        this.ModelName = ModelName;
        this.color = color;
        this.year = year;
    }
    car(car othercar){
        ModelName = othercar.ModelName;
        color = othercar.color;
        year = othercar.year;
    }
    void display(){
        System.out.println("Model Name : "+ModelName);
        System.out.println("Color : "+color);
        System.out.println("Year : "+year);
    }
}
class Constructor{
    public static void main(String[] args){
        car c1 = new car();
        car c2 = new car("XUV700","Black",2025);
        car c3 = new car(c2);
        System.out.println("Car 1 details : ");
        c1.display();
        System.out.println("Car 2 details : ");
        c2.display();
        System.out.println("Car 3 details : ");
        c3.display();
    }
}
