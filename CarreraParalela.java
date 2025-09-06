import java.util.*;
import java.util.stream.*;

public class CarreraParalela {

    // Carril 1: función para encontrar el máximo
    public static int encontrarMaximo(List<Integer> numeros) {
        return numeros.stream()
                      .max(Integer::compareTo)
                      .orElseThrow(() -> new IllegalArgumentException("Lista vacía"));
    }

    // Carril 2: función para encontrar el mínimo y cantidad de elementos
    public static Map<String, Integer> minimoYCantidad(List<Integer> numeros) {
        int minimo = numeros.stream()
                            .min(Integer::compareTo)
                            .orElseThrow(() -> new IllegalArgumentException("Lista vacía"));
        int cantidad = numeros.size();

        Map<String, Integer> resultado = new HashMap<>();
        resultado.put("minimo", minimo);
        resultado.put("cantidad", cantidad);
        return resultado;
    }

    // Función combinada: Primer choque + Segunda vuelta + Tercer choque
    public static Map<String, Object> analizarLista(List<Integer> numeros) {
        // Primer choque: máximo y mínimo + cantidad
        int maximo = encontrarMaximo(numeros);
        Map<String, Integer> minYCant = minimoYCantidad(numeros);
        int cantidad = minYCant.get("cantidad");

        // Segunda vuelta
        boolean esMultiplo2 = (maximo % 2 == 0) ? true : false; // Carril 1
        boolean esDivisor2 = (2 % maximo == 0) ? true : false;  // Carril 2

        // Tercer choque
        boolean cantidadPar = (cantidad % 2 == 0) ? true : false;  // Carril 1
        boolean cantidadImpar = (cantidad % 2 != 0) ? true : false; // Carril 2

        // Resultado final
        Map<String, Object> resultado = new HashMap<>();
        resultado.put("maximo", maximo);
        resultado.put("minimo", minYCant.get("minimo"));
        resultado.put("cantidad", cantidad);

        resultado.put("esMultiplo2", esMultiplo2);
        resultado.put("esDivisor2", esDivisor2);

        resultado.put("cantidadPar", cantidadPar);
        resultado.put("cantidadImpar", cantidadImpar);

        return resultado;
    }

    // Gran Meta: analizar dos listas de números
    public static Map<String, Object> analizarDosListas(List<Integer> lista1, List<Integer> lista2) {
        Map<String, Object> res1 = analizarLista(lista1);
        Map<String, Object> res2 = analizarLista(lista2);

        Map<String, Object> resultado = new HashMap<>();
        resultado.put("Lista1", res1);
        resultado.put("Lista2", res2);

        return resultado;
    }
}


