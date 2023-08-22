package Exeption_Lection_1;
import java.io.File;

public class lection_1 {
    public static void main(String[] args) {
        /*
        int result = (int) getFileSize(new File("/home/vlad/code_1.79.2-1686734195_amd64.deb"));
        int result1 = (int) getFileSize(new File("123"));
        if(result < 0){
            System.out.println("File not exist");
        }
        else{
            System.out.println("File size - " + result + " byte");
        }
        if(result1 < 0){
            System.out.println("File not exist");
        }
        else{
            System.out.println("File size - " + result + " byte");
        }

         */
        System.out.println(devide(10,0));
    }

    public static int devide(int a1, int a2) {

        if (a2 != 0) {
            return a1 / a2;
        }
        else{
            return -1;
        }

    }
    public static long getFileSize(File file){
        if(!file.exists()){
            return -1;
        }
        return file.length();
    }
}
