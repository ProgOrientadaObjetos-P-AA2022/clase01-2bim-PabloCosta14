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
    private Vehiculo[] vehiculos;
    private double costoBienesInmuebles;
    private double costoVehiculos;
    private double costoTotalBienes;

    public void establecerNombre(String m) {
        nombre = m;
    }

    public void establecerEdificios(Edificio[] m) {
        edificios = m;
    }

    public void establecerVehiculos(Vehiculo[] m) {
        vehiculos = m;
    }

    public void establecerCostoBienesInmuebles() {
        double suma = 0;
        for (int i = 0; i < edificios.length; i++) {
            suma = suma + edificios[i].obtenerCosto();

        }

        costoBienesInmuebles = suma;

    }

    public void establecerCostoVehiculos() {
        double suma = 0;
        for (int i = 0; i < vehiculos.length; i++) {
            suma = suma + vehiculos[i].obtenerValor();

        }

        costoVehiculos = suma;

    }

    public void establecerTotalBienes() {

        costoTotalBienes = costoBienesInmuebles + costoVehiculos;

    }

    public String obtenerNombre() {
        return nombre;
    }

    public Edificio[] obtenerEdificios() {
        return edificios;
    }

    public Vehiculo[] obtenerVehiculos() {
        return vehiculos;
    }

    public double obtenerCostoBienesInmuebles() {
        return costoBienesInmuebles;
    }

    public double obtenerCostoCostoVehiculos() {
        return costoVehiculos;
    }

    public double obtenerCostoTotalBienes() {
        return costoTotalBienes;
    }

    @Override
    public String toString() {
        String cadena = "";
        cadena = String.format("%s%s\n", cadena, nombre);
        cadena = String.format("%sLista de edificios:\n", cadena);
        for (int i = 0; i < obtenerEdificios().length; i++) {
            cadena = String.format("%s %s. %s (%.2f)\n",
                    cadena, i + 1, edificios[i].obtenerNombre().toUpperCase(),
                    edificios[i].obtenerCosto());
        }
        cadena = String.format("%s Total de Inmuebles: %.2f\n", cadena,
                obtenerCostoBienesInmuebles());
        cadena = String.format("\n%sLista de Vehiculos:\n", cadena);
        for (int i = 0; i < obtenerVehiculos().length; i++) {
            cadena = String.format("%s %s. %s, %s (%s)\n",
                    cadena, i + 1, vehiculos[i].obtenerTipo(),
                    vehiculos[i].obtenerMatricula(), vehiculos[i].obtenerValor());
        }
        cadena = String.format("%s Total Inmuebles: %.2f\n", cadena,
                obtenerCostoCostoVehiculos());
        cadena = String.format("%s Total Bienes: %.2f", cadena,
                obtenerCostoTotalBienes());
        return cadena;
    }
}
