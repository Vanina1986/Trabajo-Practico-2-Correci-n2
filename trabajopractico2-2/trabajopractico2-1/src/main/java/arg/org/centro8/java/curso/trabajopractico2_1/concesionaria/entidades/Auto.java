package arg.org.centro8.java.curso.trabajopractico2_1.concesionaria.entidades;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter // metodo publico permite acceder a los atributos declarados como pri
// dos y los muestra ejemplo: si se quisiera mostrar una marca de auto
// se pondria System.out.prrintln("la marca del auto es"+auto1.getMarca())

@EqualsAndHashCode(callSuper = true)
/*
 * Metodo Equals:definido en Object compara a lo objetoos por
 * medio de su codiggo hash.
 * Codigo hash: es un valor entero calculado por Java a partir de
 * del estado o identidad del objeto.
 * Este valor se utiliza estructuras de datos hash para facilitar la busquedad y
 * y almacenamiento eficiente de objetos. No es la direccion de memoria.
 */
public class Auto extends Vehiculo {
    /*
     * La palabra reservada extends indica que la clase extiende o
     * hereda de otra clase. En esta clase Auto hereda de la clase
     * padre Vehiculo.
     */
    private int puertas;

    // constructor
    public Auto(String marca, String modelo, int puertas, double precio) {
        super(marca, modelo, precio);
        this.puertas = puertas;
    }

    // se sobreescribio el metodo ToString para que se muestre la
    // salida en pantalla
    @Override
    public String toString() {
        DecimalFormatSymbols simbolo = new DecimalFormatSymbols(Locale.GERMANY);
        // Locale.GERMANY configura punto para miles y coma para los decimales
        DecimalFormat df = new DecimalFormat("$#,##0.00", simbolo);
        return "Marca:" + getMarca() + "// Modelo:" + getModelo() + "// Puertas:" + puertas + "// Precio"
                + df.format(getPrecio());

    }

}
