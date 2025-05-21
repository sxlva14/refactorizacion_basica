public class Main {
    
    // 1. Extract Method (Extraer método)

    /*
    Antes:
    public static void mostrarPerfilUsuario() {
        String nombreUsuario = "Salva";
        String correoUsuario = "2898560@alu.murciaeduca.es";
        int edadUsuario = 18; 

        System.out.println("Nombre del usuario: " + nombreUsuario);
        System.out.println("Correo electrónico del usuario: " + correoUsuario);
        System.out.println("Edad del usuario: " + edadUsuario);
    }
    */

    // Después: 
    private static String mostrarNombre() {
        return "Salva";
    }

    private static String mostrarCorreo() {
        return "2898560@alu.murciaeduca.es";
    }

    private static int mostrarEdad() {
        return 18;
    }

    public static void mostrarPerfilUsuario() {
        System.out.println(
            "--- Perfil del Usuario ---" +
            "\nNombre del usuario: " + mostrarNombre() + 
            "\nCorreo del usuario: " + mostrarCorreo() +
            "\nEdad del usuario: " + mostrarEdad() + 
            "\n--------------------------"
            );
    }


    // 2. Rename Variable (Renombrar variable)

    /* 
    Antes:
    public static double areaTriangulo() {
        double b = 5.0;
        double h = 3.2;

        double a = (b * h) / 2;
        return a;
    }
    */ 

    // Después:
    public static double areaTriangulo() {
        double base = 5.0;
        double altura = 3.2;

        double area = (base * altura) / 2;
        return area;
    }


    // 3. Replace Magic Number

    // Antes:
    public static void comprobarNota() {
        double nota = 4.9;

        if (nota >= 5) {
            System.out.println("Has aprobado el curso");
        } else {
            System.out.println("Has suspendido el curso");
        }
    }

    // Después:



    // 4. Introduce Explaining Variable

    // Antes:
    public static void entradaDiscoteca() {
        int edad = 18;
        double alcoholEnSangre = 0.56;
        int personasDentro = 482;
        int aforoMaximo = 700;


        if (edad >= 18 && alcoholEnSangre < 0.5 && personasDentro < aforoMaximo) {
            System.out.println("Entrada válida");
            personasDentro++;
        } else {
            System.out.println("Entrada rechazada");
        }
    }

    // Después:



    // 5. Inline Variable

    // Antes:
    public static double precioMasIVA() {
        double precio = 19.95;

        double totalConIva = precio * 1.21;
        return totalConIva;
    }

    // Después:



    public static void main(String[] args) {
        mostrarPerfilUsuario();
        System.out.println("El área del triángulo es: " + areaTriangulo());
        comprobarNota();
        entradaDiscoteca();
        System.out.println("El precio total con IVA incluido es de: " + precioMasIVA() + "€");
    }
}