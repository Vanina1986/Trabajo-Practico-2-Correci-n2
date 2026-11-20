package arg.org.centro8.java.curso.trabajopractico2_1.testconsecionaria;

import arg.org.centro8.java.curso.trabajopractico2_1.concesionaria.interfaces.implementaciones.Concesionaria;

public class TestConcesionaria {
    public static void main(String[] args) {
        Concesionaria concesionaria = new Concesionaria();
        /*
         * se llama a la clase concesionaria y se
         * crea(instancia) un objeto de la clase concesionaria
         */
        System.out.println();
        System.out.println();
        concesionaria.mostrarListaDeVehiculo();
        System.out.println();
        System.out.println("=============================");
        System.out.println();
        concesionaria.mostrarVehiculoMasCaro();
        concesionaria.mostrarVehiculoMasBarato();
        concesionaria.mostrarVehiculoQueContieneModeloY();
        System.out.println();
        System.out.println("=============================");
        System.out.println();
        System.out.println(" Vehiculos ordenados por precio de mayor a menor ");
        concesionaria.mostrarVehiculoOrdenadoDeMayorAmenorPorPrecio();
        System.out.println();
        System.out.println("=============================");
        System.out.println();
        System.out.println(" Vehiculo ordenados por orden natural(marca, modelo, precio)");
        concesionaria.mostrarVehiculoOrdenNatural();
        System.out.println();

    }
}
