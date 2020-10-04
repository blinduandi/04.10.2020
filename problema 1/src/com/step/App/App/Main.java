package App;
import converter.TempConverter.TempConverter;

public class Main {

    public static void main(String[] args)
    {
        double celsius= 100.0;
        double far,alt;
        far=100.0;
        alt = far;

        TempConverter temp = new TempConverter();

         far=temp.convertToFahr(celsius);
         celsius=temp.convertToCelsius(alt);

        System.out.println("Celsius to far: "+celsius);
        System.out.println("Fahrenheits to celsius: "+far);


    }


}
