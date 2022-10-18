import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        float earthWeightLavrinenko = 77.5555f;
        float percentageLavrinenko = 0.38f;
        double marsWeightLavrinenko;
        int marsWeightLavrinenkoInt;
        char marsWeightLavrinenkoChar;
        int mathematicalOperationLavrinenko;
        DecimalFormat decimalFormatLavrinenko;
        String marsWeightLavrinenkoString;
        marsWeightLavrinenko = earthWeightLavrinenko * percentageLavrinenko;
        decimalFormatLavrinenko = new DecimalFormat("0.####");
        System.out.println("My earth weight is " + earthWeightLavrinenko);
        System.out.println("My mars weight is " + decimalFormatLavrinenko.format(marsWeightLavrinenko));
        marsWeightLavrinenkoInt = (int) marsWeightLavrinenko;
        System.out.println("The int-type for the value is "+marsWeightLavrinenkoInt);
        marsWeightLavrinenkoChar = (char)marsWeightLavrinenkoInt;
        System.out.println("The char-type for the value is "+marsWeightLavrinenkoChar);
        mathematicalOperationLavrinenko = marsWeightLavrinenkoChar ^ 3;
        System.out.println("The result of mathematical operation is " + mathematicalOperationLavrinenko);
    }}