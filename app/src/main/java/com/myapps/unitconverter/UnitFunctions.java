package com.myapps.unitconverter;

import java.text.DecimalFormat;

import static com.myapps.unitconverter.TemperatureFragment.tempValue;
import static com.myapps.unitconverter.WeightFragment.weightValue;
import static com.myapps.unitconverter.LengthFragment.lengthValue;


public class UnitFunctions {

    public static double result;


    private static double kgToPoundsUnit = 2.205;
    private static double kgToGUnit = 1000.0;



    private static DecimalFormat df = new DecimalFormat("0.00");
    //KG to other Units

    public static double kgTopounds() {
        result = kgToPoundsUnit * weightValue;
        result = Double.parseDouble(df.format(result));
        return result;
    }

    public static double kgToG() {
        result = kgToGUnit * weightValue;
        result = Double.parseDouble(df.format(result));
        return result;

    }

    public static double kgToOunce() {
        result = 35.274 * weightValue;
        result = Double.parseDouble(df.format(result));
        return result;
    }

    public static double kgToTonne() {
        result = weightValue / 1000;
        result = Double.parseDouble(df.format(result));
        return result;
    }
//Pounds to other Units

    public static double poundsToKg() {
        result = weightValue / 2.205;
        result = Double.parseDouble(df.format(result));
        return result;
    }

    public static double poundsToG() {
        result = weightValue * 453.592;
        result = Double.parseDouble(df.format(result));
        return result;
    }

    public static double poundsToOunce() {
        result = weightValue * 16;
        result = Double.parseDouble(df.format(result));
        return result;
    }

    public static double poundsToTonnes() {
        result = weightValue / 2204.623;
        result = Double.parseDouble(df.format(result));
        return result;
    }

    public static double gToPounds() {
        result = weightValue / 453.592;
        result = Double.parseDouble(df.format(result));
        return result;
    }

    public static double gTokg() {
        result = weightValue / 1000;
        result = Double.parseDouble(df.format(result));
        return result;
    }

    public static double gToOunce() {
        result = weightValue / 28.35;
        result = Double.parseDouble(df.format(result));
        return result;

    }

    public static double gToTonne() {
        result = weightValue * 1000000;
        result = Double.parseDouble(df.format(result));
        return result;
    }


    // ounce to other Units

    public static double ounceToPounds() {
        result = weightValue / 16;
        result = Double.parseDouble(df.format(result));
        return result;
    }

    public static double ounceTokg() {
        result = weightValue / 35.274;
        result = Double.parseDouble(df.format(result));
        return result;
    }

    public static double ounceToG() {
        result = weightValue * 28.35;
        result = Double.parseDouble(df.format(result));
        return result;

    }

    public static double ounceToTonne() {
        result = weightValue / 35273.962;
        result = Double.parseDouble(df.format(result));
        return result;
    }


    //Tonnes to other units

    public static double tonnesToPounds() {
        result = weightValue * 2204.623;
        result = Double.parseDouble(df.format(result));
        return result;
    }

    public static double tonnesTokg() {
        result = weightValue * 1000;
        result = Double.parseDouble(df.format(result));
        return result;
    }

    public static double tonnesToG() {
        result = weightValue * 1000000;
        result = Double.parseDouble(df.format(result));
        return result;

    }

    public static double tonnesToOunce() {
        result = weightValue * 35273.962;
        result = Double.parseDouble(df.format(result));
        return result;
    }


    //Temperature functions
    //

    public static double celciusToFarenheit() {
        result = (tempValue * 1.8) + 32;
        result = Double.parseDouble(df.format(result));
        return result;
    }

    public static double celciusToKelvin() {
        result = tempValue + 273;
        result = Double.parseDouble(df.format(result));
        return result;
    }


    public static double farenheitToCelsius() {
        result = (tempValue - 32) * 5 / 9;
        result = Double.parseDouble(df.format(result));
        return result;
    }

    public static double farenheitToKelvin() {
        result = (tempValue + 459.67) * 5 / 9;
        result = Double.parseDouble(df.format(result));
        return result;
    }


    public static double kelvinToCelsius() {
        result = tempValue - 273;
        result = Double.parseDouble(df.format(result));
        return result;
    }

    public static double kelvinToFarenheit() {
        result = ((tempValue - 273) * 9 / 5) + 32;
        result = Double.parseDouble(df.format(result));
        return result;
    }


    //Length functions
    // Metres to other units

    public static double mToCm() {
        result = lengthValue * 100;
        result = Double.parseDouble(df.format(result));
        return result;
    }

    public static double mToInch() {
        result = lengthValue * 39.37;
        result = Double.parseDouble(df.format(result));
        return result;
    }

    public static double mToFt() {
        result = lengthValue * 3.281;
        result = Double.parseDouble(df.format(result));
        return result;
    }

    public static double mToMile() {
        result = lengthValue / 1609.344;
        result = Double.parseDouble(df.format(result));
        return result;
    }

    public static double mToKm() {
        result = lengthValue / 1000;
        result = Double.parseDouble(df.format(result));
        return result;

    }

    public static double mToYard() {
        result = lengthValue * 1.094;
        result = Double.parseDouble(df.format(result));
        return result;
    }

    // cm to other units

    public static double cmToM() {
        result = lengthValue / 100;
        result = Double.parseDouble(df.format(result));
        return result;

    }

    public static double cmToInch() {
        result = lengthValue / 2.54;
        result = Double.parseDouble(df.format(result));
        return result;
    }

    public static double cmToft() {
        result = lengthValue / 30.48;
        result = Double.parseDouble(df.format(result));
        return result;
    }


    public static double cmToMile() {
        result = lengthValue / 160934.4;
        return result;
    }

    public static double cmToKm() {
        result = lengthValue / 100000;
        return result;
    }

    public static double cmToYard() {
        result = lengthValue / 91.44;
        result = Double.parseDouble(df.format(result));
        return result;
    }


    // Inches to otehr units

    public static double inchToM() {
        result = lengthValue / 39.37;
        result = Double.parseDouble(df.format(result));
        return result;

    }

    public static double inchTocm() {
        result = lengthValue * 2.54;
        result = Double.parseDouble(df.format(result));
        return result;
    }

    public static double inchToFt() {
        result = lengthValue / 12;
        result = Double.parseDouble(df.format(result));
        return result;
    }

    public static double inchToMile() {
        result = lengthValue / 63360;
        result = Double.parseDouble(df.format(result));
        return result;

    }

    public static double inchTokm() {
        result = lengthValue / 39370.079;
        result = Double.parseDouble(df.format(result));
        return result;
    }

    public static double inchToYard() {
        result = lengthValue / 36;
        result = Double.parseDouble(df.format(result));
        return result;
    }


    // ft to other units
    public static double ftToM() {
        result = lengthValue / 3.281;
        result = Double.parseDouble(df.format(result));
        return result;
    }

    public static double ftTocm() {
        result = lengthValue * 30.48;
        result = Double.parseDouble(df.format(result));
        return result;
    }

    public static double ftToMile() {
        result = lengthValue / 5280;
        result = Double.parseDouble(df.format(result));
        return result;

    }

    public static double ftTokm() {
        result = lengthValue / 3280.84;
        result = Double.parseDouble(df.format(result));
        return result;
    }

    public static double ftToyard() {
        result = lengthValue / 3;
        result = Double.parseDouble(df.format(result));
        return result;
    }


    //mile to other units

    public static double mileToM() {
        result = lengthValue * 1609.344;
        result = Double.parseDouble(df.format(result));
        return result;
    }

    public static double mileTocm() {
        result = lengthValue * 160934.4;
        result = Double.parseDouble(df.format(result));
        return result;
    }

    public static double mileToinch() {
        result = lengthValue * 63360;
        result = Double.parseDouble(df.format(result));
        return result;
    }

    public static double mileToFt() {
        result = lengthValue * 5280;
        result = Double.parseDouble(df.format(result));
        return result;
    }

    public static double mileToKm() {
        result = lengthValue * 1.609;
        result = Double.parseDouble(df.format(result));
        return result;
    }

    public static double mileToYard() {
        result = lengthValue * 1760;
        result = Double.parseDouble(df.format(result));
        return result;
    }

    //km to other units

    public static double kmToM() {
        result = lengthValue * 1000;
        result = Double.parseDouble(df.format(result));
        return result;
    }

    public static double kmToCm() {
        result = lengthValue * 100000;
        result = Double.parseDouble(df.format(result));
        return result;
    }

    public static double kmToInch() {
        result = lengthValue * 39370.079;
        result = Double.parseDouble(df.format(result));
        return result;

    }

    public static double kmToFt() {
        result = lengthValue *  3280.84;
        result = Double.parseDouble(df.format(result));
        return result;
    }

    public static double kmtoMile() {
        result = lengthValue / 1.609;
        result = Double.parseDouble(df.format(result));
        return result;
    }

    public static double kmToYard() {
        result = lengthValue * 1093.613;
        result = Double.parseDouble(df.format(result));
        return result;
    }

    //Yard to other units
    public static double yardToM() {
        result = lengthValue / 1.094;
        result = Double.parseDouble(df.format(result));
        return result;
    }

    public static double yardToCm() {
        result = lengthValue * 91.44;
        result = Double.parseDouble(df.format(result));
        return result;
    }

    public static double yardToinch() {
        result = lengthValue * 36;
        result = Double.parseDouble(df.format(result));
        return result;
    }

    public static double yardToFt() {
        result = lengthValue * 3;
        result = Double.parseDouble(df.format(result));
        return result;
    }

    public static double yardToMile() {
        result = lengthValue / 1760;
        result = Double.parseDouble(df.format(result));
        return result;
    }

    public static double yardToKm() {
        result = lengthValue / 1093.613;
        result = Double.parseDouble(df.format(result));
        return result;

    }


}



