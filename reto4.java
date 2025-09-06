import java.util.*;

public class reto4 {

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
        Map<String, Integer> resultado = new HashMap<>(hashMap);
        hashtable.forEach((clave, valor) -> resultado.put(clave, valor));
        return resultado;
    }

    public static void imprimirClavesMayusculas(Map<String, Integer> mapa) {
        mapa.forEach((clave, valor) -> System.out.println("Clave: " + clave.toUpperCase() + " | Valor: " + valor));
    }

    public static void imprimirClavesOrdenadas(Map<String, Integer> mapa) {
        mapa.entrySet()
            .stream()
            .sorted(Map.Entry.comparingByKey())
            .forEach(entry -> System.out.println("Clave: " + entry.getKey() + " | Valor: " + entry.getValue()));
    }

    public static void main(String[] args) {
        List<Map.Entry<String, Integer>> listaHashMap = Arrays.asList(
            new AbstractMap.SimpleEntry<>("oro", 5),
            new AbstractMap.SimpleEntry<>("plata", 3),
            new AbstractMap.SimpleEntry<>("oro", 7),
            new AbstractMap.SimpleEntry<>("diamante", 10)
        );

        List<Map.Entry<String, Integer>> listaHashTable = Arrays.asList(
            new AbstractMap.SimpleEntry<>("plata", 8),
            new AbstractMap.SimpleEntry<>("rubí", 4),
            new AbstractMap.SimpleEntry<>("oro", 12),
            new AbstractMap.SimpleEntry<>("esmeralda", 6)
        );

        Map<String, Integer> hashMap = crearHashMap(listaHashMap);
        Map<String, Integer> hashTable = crearHashTable(listaHashTable);

        Map<String, Integer> combinado = combinarMapas(hashMap, hashTable);

        // Imprimir en mayúsculas y ordenadas
        imprimirClavesMayusculas(combinado);
        System.out.println("---");
        imprimirClavesOrdenadas(combinado);
    }
}

