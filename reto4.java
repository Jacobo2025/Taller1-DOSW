public static Map<String, Integer> crearHashTable(List<Map.Entry<String, Integer>> lista) {
    Map<String, Integer> mapa = new Hashtable<>();
    for (Map.Entry<String, Integer> entry : lista) {
        mapa.put(entry.getKey(), entry.getValue()); 
    }
    return mapa;
}