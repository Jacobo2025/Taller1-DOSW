import java.util.HashMap;
import java.util.Map;
public class MaquinaMisteriosa{
    Map<String, Runnable> mensajes;
    public MaquinaMisteriosa(){
        mensajes = new HashMap<>();
        mensajes.put("BROMEAR", -> System.out.printl("¿Por qué la RAM rompió con la CPU? Porque necesitaba espacio..."));
        mensajes.put("GRITAR", -> System.out.printl("¡¡¡ALERTA DE STACK OVERFLOW!!!"));
        mensajes.put("SUSURRAR", -> System.out.printl("Shhh... los bugs están dormidos."));
        mensajes.put("ANALIZAR", -> System.out.printl("Analizando datos... resultado: ¡Eres increíble programando!"));
        mensajes.put("SALUDAR", () -> System.out.println("¡Saludos, viajero del tiempo y del código!"));
        mensajes.put("DESPEDIR", () -> System.out.println("Que los bits te acompañen, hasta la próxima misión."));
        mensajes.put("CANTAR", () -> System.out.println("01010101"));
        mensajes.put("DANZAR", () -> System.out.println("Girando en modo fiesta."));
    }
    
    public void ejecutarComando(String comando){
        switch (comando){
            case "BROMEAR":
            case "GRITAR":
            case "SUSURRAR":
            case "ANALIZAR":
            case "SALUDAR":
            case "DESPEDIR":
            case "CANTAR":
            case "DANZAR":
                mensajes.get(comando).run();
            default:
                System.out.printl("Comando no encontrado");
        }
    }
}

