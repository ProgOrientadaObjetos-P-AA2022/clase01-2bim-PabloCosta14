/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia2;

import herencia1.EstudiantePresencial;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALA I
 */
public class Ejecutor2 {

    public static void main(String[] args) {
        //1.Crear un objeto de tipo estudiante Presencial con datos por teclado
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        EstudiantePresencial ep = new EstudiantePresencial();

        System.out.println("Ingrese el nombres del estudiante");
        String nom = entrada.nextLine();
        System.out.println("Ingrese el apellidos del estudiante");
        String ape = entrada.nextLine();
        System.out.println("Ingrese la identificacion del estudiante");
        String ide = entrada.nextLine();
        System.out.println("Ingrese la edad del estudiante");
        int ed = entrada.nextInt();
        System.out.println("Ingrese el numero de creditos");
        int nc = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese el costo del credito");
        double cc = entrada.nextDouble();

        ep.establecerNombresEstudiante(nom);
        ep.establecerApellidoEstudiante(ape);
        ep.establecerIdentificacionEstudiante(ide);
        ep.establecerEdadEstudiante(ed);
        ep.establecerNumeroCreditos(nc);
        ep.establecerCostoCredito(cc);
        ep.calcularMatriculaPresencial();

        System.out.printf("%s\n", ep);

    }

}
