import java.util.HashMap;
import java.util.Map;

public class MaquinaMisteriosa {
    public void ejecutarComando(String comando){
        Map<String,Runnable> mensajes = new HashMap<>();

        mensajes.put("SALUDAR", () -> System.out.println("¡Saludos, viajero del tiempo y del código!"));
        mensajes.put("DESPEDIR", () -> System.out.println("Que los bits te acompañen, hasta la próxima misión."));
        mensajes.put("CANTAR", () -> System.out.println("01010101"));
        mensajes.put("DANZAR", () -> System.out.println("Girando en modo fiesta."));

        switch (comando){
            case "SALUDAR":
                Runnable mensaje = mensajes.get(comando);
                mensaje.run();
                break;
            case "DESPEDIR":
                Runnable mensaje2 = mensajes.get(comando);
                mensaje2.run();
                break;
            case "CANTAR":
                Runnable mensaje3 = mensajes.get(comando);
                mensaje3.run();
                break;
            case "DANZAR":
                Runnable mensaje4 = mensajes.get(comando);
                mensaje4.run();
                break;
        }
    }
}
