

package com.mycompany.projectexodus;

import java.util.Scanner;
import java.util.Arrays;

public class FractionArithmetic {


    public static Scanner kb = new Scanner(System.in);


    public static void main(String [] args){


        Fraction fractionArray [];
        int number = 0;
        int decision;
        int flag = 0;

        number = getIntroduction();
        fractionArray = new Fraction[number];
        
        //decision = menu(fractionArray);
        /** Improved menu
         * Using the switch case
         * */

     while (decision != 0) {

            switch (decision) {
                case 1:
                    addAFraction(number, fractionArray);
                    break;
                case 2:
                    removeAFractions(fractionArray);
                    break;
                case 3:
                    additionOfFractions(fractionArray);
                    break;
                case 4:
                    subtractionOfFractions(fractionArray);
                    break;
                case 5:
                    multiplicationOfFractions(fractionArray);
                    break;
                case 6:
                    divisionOfFractions(fractionArray);
                    break;
                case 7:
                    simplificationOfAFraction(fractionArray);
                    break;
                default:
                    System.exit(0);
                    break;

            }
            decision = menu(fractionArray);
        }
        
        
        System.exit(0);      

    }
    public static int getIntroduction(){

        int temp = 0;

        System.out.println("This program deals with Fractions!");
        System.out.print("Please enter the number of fraction you'll be dealing with: ");
        temp = Integer.parseInt(kb.nextLine());

        return temp;
    }

    public static int menu (Fraction [] fractionArray){

        int decision = 0;

        System.out.println(" ");
        System.out.println("MENU");
        System.out.println("1. ADD A FRACTION");
        System.out.println("2. REMOVE A FRACTION");
        System.out.println("3. ADDITION OF FRACTIONS");
        System.out.println("4. SUBTRACTION OF FRACTIONS");
        System.out.println("5. MULTIPLICATION OF FRACTIONS");
        System.out.println("6. DIVISION OF FRACTIONS");
        System.out.println("7. SIMPLIFY A FRACTION");
        System.out.println("8. EXIT PROGRAM");
        System.out.println(Arrays.toString(fractionArray));
        System.out.println(" ");
        System.out.print("Enter your choice: ");
        decision = Integer.parseInt(kb.nextLine());


        return decision;
    }

    public static Fraction[] addAFraction (int number, Fraction FractionArray []){

        int n = 0;
        int d = 0;

        for (int i = 0; i<number; i++) {

            System.out.print("Enter the numerator of the" + " " + (i+1) + " " + "number: ");
            n = Integer.parseInt(kb.nextLine());

            System.out.print("Enter the denominator of the" + " " + (i+1) + " " + "number: ");
            d = Integer.parseInt(kb.nextLine());


            FractionArray[i] = new Fraction(n,d);
        }

        return FractionArray;

    }

    public static Fraction[] removeAFractions (Fraction FractionArray[]){

        int pos = 0;

        System.out.println(" ");
        System.out.println(Arrays.toString(FractionArray));
        System.out.print("Enter the position of the fraction within the array: ");

        pos = Integer.parseInt(kb.nextLine());
        pos -= pos -1;

        for (int i = 0; i<FractionArray.length; i++){

            if (i == pos){

                FractionArray[i] = null;

                for (int j = i; j<FractionArray.length; j++){

                    if (j < FractionArray.length-1)

                        FractionArray[j] = FractionArray[j+1];




                }
            }
        }


        return FractionArray;
    }


    public static void additionOfFractions(Fraction arrayOfFractions[]){

        int pos1 = 0;
        int pos2 = 0;
        float result = 0;


        Fraction sum = new Fraction ();


        System.out.println(" ");
        System.out.println(Arrays.toString(arrayOfFractions));
        System.out.print("Enter the position of the first addend: ");
        pos1 = Integer.parseInt(kb.nextLine());

        System.out.print("Enter the position of the second addend: ");
        pos2 = Integer.parseInt(kb.nextLine());

        sum = arrayOfFractions[pos1-1].add(arrayOfFractions[pos2-1]);

        result = (float) sum.getNumerator()/sum.getDenominator();

        System.out.println("The sum is: " + sum.toString() + " " + "or " + result);



    }

    public static void subtractionOfFractions (Fraction arrayOfFractions []){

        int pos1 = 0;
        int pos2 = 0;
        float result = 0;

        Fraction difference = new Fraction ();

        System.out.println(" ");
        System.out.println(Arrays.toString(arrayOfFractions));

        System.out.print("Enter the Minuend: ");
        pos1 = Integer.parseInt(kb.nextLine());

        System.out.print("Enter the Subtrahend: ");
        pos2 = Integer.parseInt(kb.nextLine());

        difference = arrayOfFractions[pos1-1].subtract(arrayOfFractions[pos2-1]);


        result = (float) difference.getNumerator()/difference.getDenominator();

        System.out.println("The difference is: " + difference.toString() + " " + "or " + result);


    }

    public static void multiplicationOfFractions (Fraction arrayOfFractions []){

        int pos1 = 0;
        int pos2 = 0;
        float result = 0;

        Fraction product = new Fraction ();

        System.out.println(" ");
        System.out.println(Arrays.toString(arrayOfFractions));

        System.out.print("Enter the multiplier: ");
        pos1 = Integer.parseInt(kb.nextLine());

        System.out.print("Enter the multiplicand: ");
        pos2 = Integer.parseInt(kb.nextLine());

        product = arrayOfFractions[pos1-1].Multiply(arrayOfFractions[pos2-1]);

        result = (float) product.getNumerator()/product.getDenominator();

        System.out.println("The product is: " + product.toString() + " " + "or " + result);

    }

    public static void divisionOfFractions (Fraction arrayOfFractions[]){

        int pos1 = 0;
        int pos2 = 0;
        float result = 0;

        Fraction quotient = new Fraction();


        System.out.print(" ");
        System.out.println(Arrays.toString(arrayOfFractions));
        System.out.print("Enter the dividend: ");
        pos1 = Integer.parseInt(kb.nextLine());

        System.out.print("Enter the divisor: ");
        pos2 = Integer.parseInt(kb.nextLine());

        quotient = arrayOfFractions[pos1-1].divideBy(arrayOfFractions[pos2-1]);

        result = (float) quotient.getNumerator()/quotient.getDenominator();

        System.out.println("The quotient is: " + quotient.toString() +  " " + "or " + result);


    }

    public static Fraction[] simplificationOfAFraction (Fraction arrayOfFractions[]){

        int pos1 = 0;
        float decimal = 0;

        Fraction sFraction = new Fraction ();

        System.out.println(" ");
        System.out.print(Arrays.toString(arrayOfFractions));

        System.out.print("Enter the position of the fraction that will be simplified: ");
        pos1 = Integer.parseInt(kb.nextLine());

        sFraction = arrayOfFractions[pos1-1].reduce();

        arrayOfFractions[pos1-1] =  sFraction;



        return arrayOfFractions;
    }
}
