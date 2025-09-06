import java.util.*;
import java.util.stream.*;

public class CarreraParalela {

    // Carril 1: máximo
    public static int encontrarMaximo(List<Integer> numeros) {
        return numeros.stream()
                      .max(Integer::compareTo)
                      .orElseThrow(() -> new IllegalArgumentException("Lista vacía"));
    }

    // Carril 2: mínimo y cantidad
    public static Map<String, Integer> minimoYCantidad(List<Integer> numeros) {
        int minimo = numeros.stream()
                            .min(Integer::compareTo)
                            .get();
        int cantidad = numeros.size();

        Map<String, Integer> resultado = new HashMap<>();
        resultado.put("minimo", minimo);
        resultado.put("cantidad", cantidad);
        return resultado;
    }

    // Función que combina ambos resultados
    public static Map<String, Object> analizarLista(List<Integer> numeros) {
        int maximo = encontrarMaximo(numeros);
        Map<String, Integer> minYCant = minimoYCantidad(numeros);

        Map<String, Object> resultado = new HashMap<>();
        resultado.put("maximo", maximo);
        resultado.put("minimo", minYCant.get("minimo"));
        resultado.put("cantidad", minYCant.get("cantidad"));

        return resultado;
    }

}
