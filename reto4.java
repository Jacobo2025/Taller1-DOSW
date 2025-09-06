public static Map<String, Integer> crearHashMap(List<Map.Entry<String, Integer>> lista) {
    Map<String, Integer> mapa = new HashMap<>();
    for (Map.Entry<String, Integer> entry : lista) {
        mapa.putIfAbsent(entry.getKey(), entry.getValue());
    }
    return mapa;
}

public static Map<String, Integer> combinarMapas(Map<String, Integer> hashMap, Map<String, Integer> hashtable) {
    Map<String, Integer> resultado = new HashMap<>(hashMap);
    hashtable.forEach((clave, valor) -> resultado.put(clave, valor));
    return resultado;
}

