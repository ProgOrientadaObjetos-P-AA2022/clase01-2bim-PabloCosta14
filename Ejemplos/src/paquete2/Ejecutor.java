/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.Edificio;
import paquete1.Empresa;
import paquete1.Vehiculo;

/**
 *
 * @author PabloCosta14
 */
public class Ejecutor {

    public static void main(String[] args) {

        // Crear una arreglo de 4 elementos de tipo Edificio 
        Edificio edf1 = new Edificio("Edificio central");
        edf1.establecerCostos(10000);
        // System.out.println(edf1);
        Edificio edf2 = new Edificio("Edificio sur");
        edf2.establecerCostos(20000);
        Edificio edf3 = new Edificio("Edificio norte");
        edf3.establecerCostos(30000);
        Edificio edf4 = new Edificio("Edificio secundario");
        edf4.establecerCostos(20000);

        Vehiculo v1 = new Vehiculo("Auto", "LBB0011", 10000);
        Vehiculo v2 = new Vehiculo("Camioneta", "LCB0012", 20000);
        Vehiculo v3 = new Vehiculo("Auto", "LBD0012", 6000);
        Vehiculo v4 = new Vehiculo("Camioneta", "LCC0011", 10000);
        Vehiculo v5 = new Vehiculo("Camioneta", "LDC0011", 25000);
        /* Edificio [] edificios  = new Edificio[4];
        edificios[0] = edf1;
        edificios[1] = edf2;
        edificios[2] = edf3;
        edificios[3] = edf4;*/
        Vehiculo[] vehiculos = {v1, v2, v3, v4, v5};

        Edificio[] edificios = {edf1, edf2, edf3, edf4};

        // Crear un objeto de tipo Empresa:
        //  Nombre: Empresa de Hojas
        Empresa miempresa = new Empresa();
        miempresa.establecerNombre("Empresa de Hojas");
        miempresa.establecerEdificios(edificios);
        miempresa.establecerVehiculos(vehiculos);
        miempresa.establecerCostoBienesInmuebles();
        miempresa.establecerCostoVehiculos();
        miempresa.establecerTotalBienes();

        //System.out.printf("%.2f\n",miempresa.obtenerCostoBienesInmuebles());
        //  Lista de edificio: edf1, edf2, edf3, edf4
        // Imprimir el costo de los bienes inmuebles de la empresa
        System.out.printf("%s\n", miempresa);
    }
}
