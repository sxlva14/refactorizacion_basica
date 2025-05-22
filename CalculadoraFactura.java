/**
 * Calcula el total a pagar por una factura, aplicando primero un descuento
 * al precio base recibido como parámetro y luego sumando un impuesto fijo.
 * Imprime un resumen con los valores aplicados y el total.
 */
public class CalculadoraFactura {

    /*public static void calcular(double pb, double d) {
        double i = 21.0; // porcentaje de impuesto fijo

        double p = pb - (pb * d / 100);
        double t = p + (p * i / 100);

        System.out.println("El precio base es: " + pb);
        System.out.println("Descuento aplicado: " + d + "%");
        System.out.println("Impuesto aplicado: " + i + "%");
        System.out.println("El total a pagar es: " + t);
    }*/

    public static void calcular(double precioBase, double descuento) {
        double impuestoFijo = 21.0; // porcentaje de impuesto fijo
        int cien = 100;

        double descontado = precioBase * descuento / cien;
        double precioDescontado = precioBase - descontado; 

        double impuestoAplicado = precioDescontado * impuestoFijo / cien;
        double total = precioDescontado + impuestoAplicado;

        mostrarPrecioBase(precioBase);
        mostrarDescuento(descuento);
        mostrarImpuestoAplicado(impuestoFijo);
        totalAPagar(total);
    }

    public static void mostrarPrecioBase(double precioBase) {
        System.out.println("El precio base es: " + precioBase);
    }

    public static void mostrarDescuento(double descuento) {
        System.out.println("Descuento aplicado: " + descuento + "%");
    }

    public static void mostrarImpuestoAplicado(double impuestoFijo) {
        System.out.println("Impuesto aplicado: " + impuestoFijo + "%");
    }

    public static void totalAPagar(double total) {
        System.out.println("El total a pagar es: " + total);
    }
}