/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia2;

import herencia1.EstudianteDistancia;
import herencia1.EstudiantePresencial;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALA I
 */
public class Ejecutor3 {

    public static void main(String[] args) {
        /*
        En el método **main**, se debe permitir ingresar objetos 
        de tipo Estudiante Distancia y Estudiante Presencial. 
        Uno a la vez. Si el usuario ingresa 1, se debe crear un 
        Estudiante Distancia por teclado; si ingresa 2, se debe crear un 
        Estudiante Presencial. Los datos de entrada serán ingresados por 
        teclado.

        Restricciones:
        * En el código solo debe usar por una sola ocasión la siguiente 
        sentencias
        ```
            nombres = entrada.nextLine()
            apellidos = entrada.nextLine()
            cedula = entrada.nextLine()
            edad = entrada.nextInt()
        ```
        * Si el usuario ingresa algo diferente de 1 o 2; el programa debe 
        presentar un mensaje que diga: "Error, opción no válida."
        
         */
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("Ingrese 1 para crear un Estudiante Distancia\n"
                + "Ingrese 2 para crear un Estudiante Presencial"
        );
        int op = entrada.nextInt();
        if (op == 1 || op == 2) {
            entrada.nextLine();
            System.out.println("Ingrese el nombres del estudiante");
            String nom = entrada.nextLine();

            System.out.println("Ingrese el apellidos del estudiante");
            String ape = entrada.nextLine();
            System.out.println("Ingrese la identificacion del estudiante");
            String ide = entrada.nextLine();
            System.out.println("Ingrese la edad del estudiante");
            int ed = entrada.nextInt();

            switch (op) {
                case 1:
                    EstudianteDistancia estudiante = new EstudianteDistancia();

                    entrada.nextLine();
                    System.out.println("Ingrese el costo de la asignatura");
                    double nc = entrada.nextDouble();

                    System.out.println("Ingrese el numero de asignaturas");
                    int cc = entrada.nextInt();
                    estudiante.establecerNombresEstudiante(nom);
                    estudiante.establecerApellidoEstudiante(ape);
                    estudiante.establecerIdentificacionEstudiante(ide);
                    estudiante.establecerEdadEstudiante(ed);
                    estudiante.establecerCostoAsignatura(nc);
                    estudiante.establecerNumeroAsginaturas(cc);

                    estudiante.calcularMatriculaDistancia();
                    System.out.println("----------------------------------");
                    System.out.printf("%s\n", estudiante);
                    break;
                case 2:
                    EstudiantePresencial ep = new EstudiantePresencial();

                    System.out.println("Ingrese el numero de creditos");
                    int f = entrada.nextInt();
                    entrada.nextLine();
                    System.out.println("Ingrese el costo del credito");
                    double da = entrada.nextDouble();

                    ep.establecerNombresEstudiante(nom);
                    ep.establecerApellidoEstudiante(ape);
                    ep.establecerIdentificacionEstudiante(ide);
                    ep.establecerEdadEstudiante(ed);
                    ep.establecerNumeroCreditos(f);
                    ep.establecerCostoCredito(da);
                    ep.calcularMatriculaPresencial();
                    System.out.println("----------------------------------");
                    System.out.printf("%s\n", ep);

                    break;

                default:
                    System.out.println("Error,opcion no valida");
                    break;

            }
        } else {
            System.out.println("Error,opcion no valida");
        }

    }

}
