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

    }
    
    public void ejecutarComando(String comando){
        switch (comando){
            case "BROMEAR":
            case "GRITAR":
            case "SUSURRAR":
            case "ANALIZAR":
                mensajes.get(comando).run();
            default:
                System.out.printl("Comando no encontrado");
        }
    }
}