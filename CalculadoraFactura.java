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

        mostrarTodaInformacion(precioBase, descuento, impuestoFijo, total);
    }

    public static String mostrarPrecioBase(double precioBase) {
        return "El precio base es: " + precioBase;
    }

    public static String mostrarDescuento(double descuento) {
        return "Descuento aplicado: " + descuento + "%";
    }

    public static String mostrarImpuestoAplicado(double impuestoFijo) {
        return "Impuesto aplicado: " + impuestoFijo + "%";
    }

    public static String totalAPagar(double total) {
        return "El total a pagar es: " + total;
    }

    public static void mostrarTodaInformacion(double precioBase, double descuento, double impuestoFijo, double total) {
        System.out.println(mostrarPrecioBase(precioBase));
        System.out.println(mostrarDescuento(descuento));
        System.out.println(mostrarImpuestoAplicado(impuestoFijo));
        System.out.println(totalAPagar(total));
    }
}