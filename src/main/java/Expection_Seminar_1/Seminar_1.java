package Expection_Seminar_1;

public class Seminar_1 {
    public static void main(String[] args) {
        int[] numbers = new int[4];
        try {
            System.out.println("message1");
            numbers[10] = 10;
            System.out.println("message2");
            int a = 5 / 0;
            System.out.println("message3");
        } catch (ArithmeticException e) {
            System.out.println("message4");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("message5");
        }
        System.out.println("message6");
    }
}
