import java.util.Scanner;

public class MultiplesOfInput {
    public static void main(String[] args) {
        int vInput;
        Scanner input=new Scanner(System.in);

        System.out.print("Sayı giriniz : ");
        vInput=input.nextInt();

        System.out.println("...Girilen sayıya kadar 4'ün katları...");
        for(int i=1;i<=vInput;i*=4){
                System.out.println(i);
        }
        System.out.println("...Girilen sayıya kadar 5'in katları...");
        for(int i=1;i<=vInput;i*=5){
                System.out.println(i);
        }
    }


}
