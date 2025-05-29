public class TempMaf {

    public static double celsiusConvert(double celsius, String convertTo) {

        if (convertTo.equals("C")) {
            return celsius;
        } else if (convertTo.equals("F")) {
            return (celsius * ((double) 9 /5) + 32);
        } else {
            return celsius + 273.15;
        }

    }

    public static double fahrenheitConvert(double fahrenheit, String convertTo) {

        if (convertTo.equals("C")) {
            return (fahrenheit - 32) * ((double) 5 /9);
        } else if (convertTo.equals("F")) {
            return fahrenheit;
        } else {
            return  (fahrenheit + 459.67) * ((double) 5 /9);
        }

    }

    public static double kelvinConvert(double kelvin, String convertTo) {

        if (convertTo.equals("C")) {
            return kelvin - 273.15;
        } else if (convertTo.equals("F")) {
            return (kelvin * ((double) 9 /5)) - 459.67;
        } else {
            return kelvin;
        }

    }

}
