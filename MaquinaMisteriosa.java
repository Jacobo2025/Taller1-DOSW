import java.util.HashMap;
import java.util.Map;

public class MaquinaMisteriosa {
    Map<String,Runnable> mensajes;
    public MaquinaMisteriosa() {
        mensajes = new HashMap<>();

        mensajes.put("SALUDAR", () -> System.out.println("¡Saludos, viajero del tiempo y del código!"));
        mensajes.put("DESPEDIR", () -> System.out.println("Que los bits te acompañen, hasta la próxima misión."));
        mensajes.put("CANTAR", () -> System.out.println("01010101"));
        mensajes.put("DANZAR", () -> System.out.println("Girando en modo fiesta."));
    }
    public void ejecutarComando(String comando){

        switch (comando){
            case "SALUDAR":
            case "DESPEDIR":
            case "CANTAR":
            case "DANZAR":
                mensajes.get(comando).run();
                break;
            default:
                System.out.println("Comando no reconocido.");

        }
    }
}
