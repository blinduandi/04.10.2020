package App;
import converter.TempConverter.TempConverter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti grade celsius: ");
        double celsius= sc.nextDouble();
        double far,alt;
        System.out.println("Introduceti grade farenheits: ");
        far=sc.nextDouble();
        alt = far;

        TempConverter temp = new TempConverter();

         celsius=temp.convertToFahr(celsius);
         far=temp.convertToCelsius(alt);

        System.out.println("Celsius to far: "+celsius);
        System.out.println("Fahrenheits to celsius: "+far);


    }


}
