package arg.org.centro8.java.curso.trabajopractico2_1.concesionaria.entidades;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = true)
public class Moto extends Vehiculo {
    private int cilindrada;
    /*
     * atributo privado acceso restringido. Accesible solo de la clase que
     * se esta definiendo.Utilizado para declarar miembros que solo deben
     * ser utlizados por la clase.
     */

    /*
     * se creo un constructor(metodo que permite crear objetos de la clase tienen el
     * mismo nombre de la clase.
     * 
     */

    public Moto(String marca, String modelo, int cilindrada, double precio) {
        super(marca, modelo, precio);// son los atributos heredados de la clase padre
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        DecimalFormatSymbols simbolo = new DecimalFormatSymbols(Locale.GERMANY);
        // Locale.GERMANY configura punto para miles y coma para los decimales
        DecimalFormat df = new DecimalFormat("$#,##0.00", simbolo);
        return "marca:" + getMarca() + "// modelo:" + getModelo() + "// cilindrada:" + cilindrada + "c //precio"
                + df.format(getPrecio());

    }
}
