/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia2;

import herencia1.EstudianteDistancia;

/**
 *
 * @author PabloCosta14
 */
public class Ejecutor {

    public static void main(String[] args) {
        EstudianteDistancia estudiante = new EstudianteDistancia();
        estudiante.establecerNombresEstudiante("Pablo Andres");
        estudiante.establecerApellidoEstudiante("Costa Torres");
        estudiante.establecerIdentificacionEstudiante("1150146163");
        estudiante.establecerEdadEstudiante(19);
        estudiante.establecerCostoAsignatura(30);
        estudiante.establecerNumeroAsginaturas(5);
        estudiante.calcularMatriculaDistancia();
        /*
        System.out.printf("%s  (%.2f)\n",
                estudiante.obtenerApellidoEstudiante(),
                estudiante.obtenerMatriculaDistancia());*/
        
        
        System.out.printf("%s\n",estudiante);
    }

}
