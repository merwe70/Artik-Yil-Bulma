import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int year;

        Scanner input = new Scanner(System.in);
        System.out.println("Doğum yılınızı giriniz : ");
        year = input.nextInt();

        if ( year > 0){
            if (year % 4 ==0){
                System.out.println(year +  " bir artık yıldır !");
            }
            else {
                System.out.println(year + " bir artık yıldır değildir !");
        }
        }
    }
}