package com.mycompany.projectexodus;



public class Fraction {

    private int numerator;
    private int denominator;


    public Fraction (){


        numerator = 0;
        denominator = 0;


    }


    public Fraction(int n, int d){


        numerator = n;
        denominator = d;


    }


    public void setNumerator (int n){


        numerator = n;


    }

    public void setDenominator(int d){




        denominator = d;


    }

    public int getNumerator (){


        return numerator;
    }

    public int getDenominator (){


        return denominator;
    }

    public int computeGCD(int num1, int num2){

        int n = num1;
        int d = num2;

        Integer temp = null;
        Integer temp2 = null;
        Integer temp3 = null;



        int flag = 0;

        do {

            temp = n%d;

            if (temp == 0) {

                temp3 = d;
                flag = 3;



            } else if (temp > 0) {

                n = d;
                d = temp;

            }

        } while (flag !=3);


            return temp3;
    }



    public Fraction add (Fraction fraction) {

        int newNumerator = 0;
        int newDenominator = 0;
        int temp = 0;
        int LCM = 0;

        if (denominator == fraction.getDenominator()) {

            newNumerator = numerator + fraction.getNumerator();


            return new Fraction(newNumerator, fraction.getDenominator());

        } else {

            temp = computeGCD(fraction.getDenominator(), denominator);
            newDenominator = (fraction.getDenominator() * denominator) / temp;
            newNumerator = (fraction.getNumerator() * (newDenominator/fraction.getDenominator())) + (numerator * (newDenominator/denominator));

            return new Fraction(newNumerator, newDenominator);

        }

    }

    public Fraction subtract (Fraction fraction){


            int newNumerator = 0;
            int newDenominator = 0;

            if (fraction.getDenominator() == denominator){

                newNumerator = fraction.getNumerator()-numerator;

                return new Fraction(newNumerator, denominator);

            }

            else{


                newDenominator = fraction.getDenominator() * denominator;
                newNumerator = (fraction.getDenominator()* numerator) - (denominator*fraction.getNumerator());

                return new Fraction(newNumerator, newDenominator);
            }

        }

    public Fraction Multiply (Fraction fraction) {

        int newNumerator = 0;
        int newDenominator = 0;

        if (fraction.getDenominator() == denominator) {

            newNumerator = fraction.getNumerator() * numerator;

            return new Fraction(newNumerator, denominator);
        } else {

            newNumerator = fraction.getNumerator() * numerator;
            newDenominator = fraction.getDenominator() * denominator;

            return new Fraction(newNumerator, newDenominator);
        }

    }


    public Fraction divideBy (Fraction fraction){

            int newNumerator = 0;
            int newDenominator = 0;


            newNumerator = numerator * fraction.getDenominator();
            newDenominator = denominator*fraction.getNumerator();



        return new Fraction(newNumerator, newDenominator);
    }


    public Fraction reduce (){


        int GCD = computeGCD(numerator, denominator);

        int newNumerator = numerator/GCD;
        int newDenominator = denominator/GCD;


        return new Fraction (newNumerator, newDenominator);
    }



    public String toString(){



        return (numerator + "/" + denominator);
    }




}
