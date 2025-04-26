class ArrayError{
    public static void main(String[] args){
        int[] numbers = {1,2,3,4,5};
        try{
            System.out.println("Index 10 : "+numbers[10]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index out of bound");
        }
        System.out.println("Continues");
    }
}