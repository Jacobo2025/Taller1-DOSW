import java.util.Arrays;
import java.util.List;

public class MensajeBienvenida {
    List<Estudiante> estudiantes;

    public MensajeBienvenida(){
        estudiantes =  Arrays.asList(new Estudiante("Jacobo Diaz", 7, 20, "jacobo.diaz-a@mail.escuelaing.edu.co"), new Estudiante("Maria Paula", 7, 20, "maria.rmunoz@mail.escuelaing.edu.co"));

    }

    public void mostrarMensaje(){
        String mensaje = "¡Hola Bienvenidos! Nosotros somos la pareja conformada por ";


        mensaje += estudiantes.stream().map(e -> e.getNombre() + " estudiante de la escuela de " +
                        (e.getSemestre() == 5 ? "5to" : e.getSemestre() + " semestre") +
                        " de " + e.getAños() + " años")
                .reduce((a, b) -> a + " y " + b) // unir con " y "
                .orElse("");

        mensaje += ", nuestros correos institucionales son ";


        mensaje += estudiantes.stream()
                .map(Estudiante::getCorreo)
                .reduce((a, b) -> a + " y " + b)
                .orElse("");

        System.out.println(mensaje);
    }
}
