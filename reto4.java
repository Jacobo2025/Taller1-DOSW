public static Map<String, Integer> crearHashTable(List<Map.Entry<String, Integer>> lista) {
    Map<String, Integer> mapa = new Hashtable<>();
    for (Map.Entry<String, Integer> entry : lista) {
        mapa.put(entry.getKey(), entry.getValue()); 
    }
    return mapa;
}

public static Map<String, Integer> combinarMapas(Map<String, Integer> hashMap, Map<String, Integer> hashtable) {
    Map<String, Integer> resultado = new Hashtable<>(hashtable); // empieza con Hashtable
    // Solo agrega los que no esten en el Hashtable
    hashMap.forEach((clave, valor) -> resultado.putIfAbsent(clave, valor));
    return resultado;
}

public static void imprimirClavesOrdenadas(Map<String, Integer> mapa) {
    mapa.entrySet()
        .stream()
        .sorted(Map.Entry.comparingByKey())
        .forEach(entry -> System.out.println("Clave: " + entry.getKey() + " | Valor: " + entry.getValue()));
}
