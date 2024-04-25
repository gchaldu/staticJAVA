import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Properties;
import java.io.IOException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    static int numero;

    static {
        try {
            // Intenta realizar alguna operación que pueda lanzar una excepción
            numero = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            // Maneja la excepción aquí
            System.out.println("Se produjo una excepción durante la inicialización estática: " + e.getMessage());
            // Asigna un valor predeterminado en caso de excepción
            numero = 0;
        }
    }
    private static Properties propiedades = new Properties();

    static {
        try {
            FileInputStream archivoConfiguracion = new FileInputStream("config.properties");
            propiedades.load(archivoConfiguracion);
            archivoConfiguracion.close();
        } catch (IOException e) {
            System.err.println("Error al cargar el archivo de configuración: " + e.getMessage());
        }
    }
    public static String obtenerValor(String clave) {
        return propiedades.getProperty(clave);
    }



    public static void main(String[] args) {
        Cliente cliente = new Cliente("Gabriel");
        Cliente cliente2 = new Cliente("Juan");
        Cliente cliente3 = new Cliente("Beto");

        System.out.println("cliente.toString() = " + cliente.toString());
        System.out.println("cliente.toString() = " + cliente2.toString());
        System.out.println("cliente.toString() = " + cliente3.toString());

        System.out.println("Cantidad de clientes " + (Cliente.getId()));
        System.out.println("Número en el método main: " + numero);

        String valor = Main.obtenerValor("clave");
        System.out.println("Valor de configuración: " + valor);

    }
    static String nombreArchivo = "archivo.txt";
    static {
        try (BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
