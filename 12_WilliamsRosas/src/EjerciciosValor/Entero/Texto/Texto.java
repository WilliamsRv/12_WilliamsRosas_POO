
package EjerciciosValor.Entero.Texto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Williams
 */
public class Texto {

    public String obtenerSaludo() {
        return "¡Hola! ¿Cómo estás?";
    }

    public String obtenerDespedida() {
        return "¡Hasta luego! Que tengas un buen día.";
    }

    public String generarMensajeError() {
        return "Ha ocurrido un error inesperado.";
    }

    public String obtenerNombreDiaActual() {
        LocalDate fechaActual = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE");
        return fechaActual.format(formatter);
    }

    public String saludarUsuario(String nombre) {
        return "¡Hola, " + nombre + "! Bienvenido.";
    }

}
