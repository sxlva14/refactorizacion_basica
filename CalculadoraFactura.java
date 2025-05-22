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

    public static void calcular(double pb, double d) {
        double i = 21.0; // porcentaje de impuesto fijo

        double p = pb - (pb * d / 100);
        double t = p + (p * i / 100);

        mostrarPrecioBase(pb);
        mostrarDescuento(d);
        mostrarImpuestoAplicado(i);
        totalAPagar(t);
    }

    public static void mostrarPrecioBase(double pb) {
        System.out.println("El precio base es: " + pb);
    }

    public static void mostrarDescuento(double d) {
        System.out.println("Descuento aplicado: " + d + "%");
    }

    public static void mostrarImpuestoAplicado(double i) {
        System.out.println("Impuesto aplicado: " + i + "%");
    }

    public static void totalAPagar(double t) {
        System.out.println("El total a pagar es: " + t);
    }
}