/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Empresa {

    private String nombre;
    private Edificio[] edificios;
    private double costoBienesInmuebles;

    public void establecerNombre(String m) {
        nombre = m;
    }

    public void establecerEdificios(Edificio[] m) {
        edificios = m;
    }

    public void establecerCostoBienesInmuebles() {
        double suma = 0;
        for (int i = 0; i < edificios.length; i++) {
            suma = suma + edificios[i].obtenerCosto();

        }

        costoBienesInmuebles = suma;

    }

    public String obtenerNombre() {
        return nombre;
    }

    public Edificio[] obtenerEdificios() {
        return edificios;
    }

    public double obtenerCostoBienesInmuebles() {
        return costoBienesInmuebles;
    }

    public String toString() {
          String cadena = "";
        cadena = String.format("%s%s\n",cadena,nombre );
        cadena = String.format("%sLista de edificios:\n",cadena);
        for (int i = 0; i < obtenerEdificios().length; i++) {
            cadena = String.format("%s %s. %s (%.2f)\n",
                    cadena, i + 1, edificios[i].obtenerNombre().toUpperCase(),
                    edificios[i].obtenerCosto());
        }
        cadena = String.format("%s Total de Inmuebles: %.2f", cadena,
                obtenerCostoBienesInmuebles());
        return cadena;
    }
}
