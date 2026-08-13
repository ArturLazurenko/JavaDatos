package CososRandom;

import java.util.Scanner;

public class so {
    public static void main(String[] args) {
        System.out.println("holanda mundo");
        int edad = 19;
        float altura = 1.78f;
        double peso = 65.5;
        String nombre = "Artur";
        char grupo = 'A';
        boolean esEstudiante = true;
        System.out.println("\n -Datos del alumno-");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("Grupo: " + grupo);
        System.out.println("Es estudiante: " + esEstudiante);

        int a = 6;
        int b = 7;
        int suma = a + b;
        System.out.println("la suma da " + suma);

        Scanner sc = new Scanner(System.in);

        System.out.print("de que estado eres?: ");
        String estado = sc.nextLine();
        System.out.println("tu estado es: " + estado);

        System.out.print("ingresa tu calificacion: ");
        int cal = sc.nextInt();
        if (cal >= 90 && cal <=100) {
            System.out.println("ahuevo we");
        } else if (cal >= 80 && cal < 90) {
            System.out.println("ta bien no");
        } else if (cal >= 70 && cal < 80) {
            System.out.println("pues si no? xd");
        } else if (cal < 70 && cal >= 0) {
            System.out.println("pinshi pendejo XDDDDDDDDDD");
        }else {
            System.out.println("creo que reprobaste lectura we");
        }

        System.out.print("cual tabla pa?: ");
        int tabla = sc.nextInt();
        for (int i = 0; i < 10; i++) {
            int resultado = tabla * (i + 1);
            System.out.println(tabla + " x " + (i + 1) + " = " + resultado);
        }

        int thegrefg = 5;
        System.out.println("-----CONTADOR----");
        while (thegrefg > 0) {
            System.out.println(thegrefg);
            thegrefg--;
        }

        int opcion;
        do {
            System.out.println("-----MENU-----");
            System.out.println("1. Saludar");
            System.out.println("2. Mostrar hora");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opcion(1-3): ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("holanda bro");
                    break;
                case 2:
                    System.out.println("son las 9 we");
                    break;
                case 3:
                    System.out.println("adeus pa");
                    break;
                default:
                    System.out.println("Opcion invalida. Intenta de nuevo.");
            }
        } while (opcion != 3);
        sc.close();


    }
}
