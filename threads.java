class Upcount extends Thread{
    public void run(){
        System.out.println("Printing from 1 to 100");
        for(int i=1;i<=100;i++){
            System.out.println(i+" ");
        }
    }
}

class DownCount extends Thread{
    public void run(){
        System.out.println("Printing from 100 to 1");
        for(int i=100;i>=1;i--){
            System.out.println(i+" ");
        }
    }
}

class threads{
    public static void main(String[] args){
    Upcount up = new Upcount();
    DownCount down = new DownCount();

    up.start();
    down.start();
    }
}
