package dev.sergioescriva;

public class FactorPrimo {
    public static void main(String[] args) {
        factores();
    }

    public static void factores() {

        /*
         * Encontrar el factor primo más grande de 120:
         * 
         * a) 120 es divisible por 2, por lo que dividimos: 120 ÷ 2 = 60.
         * b)60 es divisible por 2, por lo que dividimos: 60 ÷ 2 = 30.
         * c)30 no es divisible por 2, pasamos al siguiente primo impar: 3. 30 es
         * ...
         */

        Long end = 600851475143L;

        Integer multiplo;

        for (multiplo = 2; multiplo < end; multiplo++) {

            while (end % multiplo == 0) {
                end /= multiplo;
            }

        }
        System.out.println("Factor primo más grande: " + (multiplo));
    }

}
