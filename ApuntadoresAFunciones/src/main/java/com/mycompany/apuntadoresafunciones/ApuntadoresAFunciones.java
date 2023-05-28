
package com.mycompany.apuntadoresafunciones;

import java.util.Scanner;
import java.util.function.BinaryOperator;

public class ApuntadoresAFunciones {

    public static double suma(Double a, Double b) {
        return a + b;
    }

    public static double resta(Double a, Double b) {
        return a - b;
    }

    public static double multiplicacion(Double a, Double b) {
        return a * b;
    }

    public static double division(Double a, Double b) {
        return a / b;
    }

    public static double potencia(Double a, Double b) {
        return Math.pow(a, b);
    }

    public static void main(String[] args) {
        int tecla = 0;
        Scanner scanner = new Scanner(System.in);
        String menu = "Elija la operación a realizar:\n1.Suma\n2.Resta\n3.Multiplicación\n4.Division\n5.Potencia\n6.Salir\n";
        System.out.println(menu);
        tecla = scanner.nextInt();
        while (tecla != 6) {
            if (tecla >= 1 && tecla <= 5) {
                System.out.print("Ingrese el número 1: ");
                double num1 = scanner.nextDouble();
                System.out.print("Ingrese el número 2: ");
                double num2 = scanner.nextDouble();

                BinaryOperator<Double> operacion = null;

                if (tecla == 1) {
                    operacion = ApuntadoresAFunciones::suma;
                } else if (tecla == 2) {
                    operacion = ApuntadoresAFunciones::resta;
                } else if (tecla == 3) {
                    operacion = ApuntadoresAFunciones::multiplicacion;
                } else if (tecla == 4) {
                    operacion = ApuntadoresAFunciones::division;
                } else if (tecla == 5) {
                    operacion = ApuntadoresAFunciones::potencia;
                }
                try {
                    double resultado = operacion.apply(num1, num2);
                    System.out.println("Resultado: " + resultado+"\n");
                } catch (Exception e) {
                    System.out.println("Error: " + e);
                }

            } else {
                System.out.println("Opción no válida\n");
            }

            System.out.println(menu);
            tecla = scanner.nextInt();
        }
        scanner.close();
    }

}
