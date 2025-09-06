import java.util.*;
import java.util.stream.*;

public class Reto4 {

    public static Map<String, Integer> crearHashMap(List<Map.Entry<String, Integer>> lista) {
        Map<String, Integer> mapa = new HashMap<>();
        for (Map.Entry<String, Integer> entry : lista) {
            mapa.putIfAbsent(entry.getKey(), entry.getValue());
        }
        return mapa;
    }

    public static Map<String, Integer> crearHashTable(List<Map.Entry<String, Integer>> lista) {
        Map<String, Integer> mapa = new Hashtable<>();
        for (Map.Entry<String, Integer> entry : lista) {
            mapa.put(entry.getKey(), entry.getValue());
        }
        return mapa;
    }

    public static Map<String, Integer> combinarMapas(Map<String, Integer> hashMap, Map<String, Integer> hashtable) {
        Map<String, Integer> resultado = new HashMap<>(hashMap); // comienza con HashMap
        hashtable.forEach((clave, valor) -> resultado.put(clave, valor)); // sobrescribe con Hashtable
        return resultado;
    }

    public static void imprimirClavesMayusculas(Map<String, Integer> mapa) {
        mapa.forEach((clave, valor) -> System.out.println("Clave: " + clave.toUpperCase() + " | Valor: " + valor));
    }
}

public static void imprimirClavesOrdenadas(Map<String, Integer> mapa) {
    mapa.entrySet()
        .stream()
        .sorted(Map.Entry.comparingByKey())
        .forEach(entry -> System.out.println("Clave: " + entry.getKey() + " | Valor: " + entry.getValue()));
}
