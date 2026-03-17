package instituto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorRegistroTest
{

    // Traemos el "motor" que vamos a probar desde la carpeta main
    ValidadorRegistro validador = new ValidadorRegistro();

    @Test
    @DisplayName("Ejemplo: Un nombre válido debe ser aceptado")
    public void testNombreValido()
    {
        // Ejecutamos la lógica con un nombre correcto
        boolean resultado = validador.validarNombre("Carlos");

        // Sentenciamos: Como el nombre está bien, esperamos que el resultado sea TRUE
        assertTrue(resultado, "Error: El sistema rechazó un nombre válido");
    }

    @Test
    @DisplayName("Reto 1: Nombre vacío")
    public void testNombreVacio()
    {
        boolean resultado=validador.validarNombre("");
        assertFalse(resultado,"Error: El nombre está vacío.");
    }

    @Test
    @DisplayName("Reto 2: Password justa")
    public void passwordJusta()
    {
        boolean resultado=validador.validarPassword("12345678");
        assertTrue(resultado,"Error: El sistema no reconoce la contraseña");
    }

    @Test
    @DisplayName("Reto 3: Password corta")
    public void passwordCorta()
    {
        boolean resultado=validador.validarPassword("Admin");
        assertFalse(resultado,"Error: Contraseña demasiado corta");
    }

    @Test
    @DisplayName("Reto 4: Email sin arroba")
    public void emailSinArroba()
    {
        boolean resultado=validador.validarEmail("usuario.gmail.com");
        assertFalse(resultado,"Error: El correo electrónico no es válido");
    }

    @Test
    @DisplayName("Reto 5: Edad límite")
    public void edadLimite()
    {
        boolean resultado=validador.validadEdad(16);
        assertTrue(resultado,"Error: El sistema no reconoce la edad del usuario");
    }

}