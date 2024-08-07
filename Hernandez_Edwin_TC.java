/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.hernandez_edwin_hw3_enclase;

import java.util.Scanner;

/**
 *
 * @author edwinhernandezlopez
 */
public class Hernandez_Edwin_TC {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cicloMenu = 1;
        int cicloOpcion = 1;
        int opcion;

        do {
            System.out.println("--- Menú Prinicipal ---\n");
            System.out.println("1- Área de Triángulos");
            System.out.println("2- Mínimo Común Múltiplo y Máximo Común Divisor");
            System.out.println("3- Número Perfecto");
            System.out.println("4- Salir\n");

            System.out.print("Ingrese su opción: ");

            do {
                opcion = scan.nextInt();

                if (opcion < 1 && opcion > 4) {
                    System.out.println("Ingrese una opción válida\n");

                } else if (opcion == 1) {
                    System.out.println("\nÁrea de Triángulos");
                    cicloOpcion = 0;
                } else if (opcion == 2) {
                    System.out.println("\nMínimo Común Múltiplo y Máximo Común Divisor\n");
                    cicloOpcion = 0;
                } else if (opcion == 3) {
                    System.out.println("\nNúmero Perfecto\n");
                    cicloOpcion = 0;

                } else if (opcion == 4) {
                    System.out.println("adios :)");
                    cicloOpcion = 0;
                    cicloMenu = 0;
                }

            } while (cicloOpcion > 0);

            if (opcion == 1) {
                int cicloTriangulos = 1;
                int contadorTriangulos = 8;

                double base;
                double altura;
                double area;
                double areaMayor = 0;

                String trianguloMayor = "";

                while (cicloTriangulos <= contadorTriangulos) {
                    System.out.println("\nTriángulo #" + cicloTriangulos);
                    System.out.print("Base del triángulo: ");
                    base = scan.nextDouble();
                    System.out.print("Altura del triángulo: ");
                    altura = scan.nextDouble();

                    area = (base / 2) * altura;
                    System.out.println("Área: " + area);

                    if (area > areaMayor) {
                        areaMayor = area;
                        trianguloMayor = "Triangulo #" + cicloTriangulos;

                    }

                    cicloTriangulos++;
                }

                System.out.println("\nÁrea Mayor: " + areaMayor);
                System.out.println(trianguloMayor + "\n");

            } else if (opcion == 2) {
                int numero1=0;
                int numero2 = 0;

                while (numero1<=0){
                System.out.print("Ingrese el primer número: ");
                numero1 = scan.nextInt();
                }
                
                while (numero2<=0){
                System.out.print("Ingrese el segundo número: ");
                numero2=scan.nextInt();
                }

                if (numero1 > numero2) {
                    
                }

            } else if (opcion == 3) {
                int numero=0;
                
                System.out.println("");
                
            }
            
        } while (cicloMenu > 0);
    }
}
