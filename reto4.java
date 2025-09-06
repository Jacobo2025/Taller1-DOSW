public static Map<String, Integer> crearHashMap(List<Map.Entry<String, Integer>> lista) {
    Map<String, Integer> mapa = new HashMap<>();
    for (Map.Entry<String, Integer> entry : lista) {
        mapa.putIfAbsent(entry.getKey(), entry.getValue());
    }
    return mapa;
}
