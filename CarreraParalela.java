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
        int cantidad = minYCant.get("cantidad");
    //Segunda Vuelta
        boolean esMultiplo2 = (maximo % 2 == 0) ? true : false; // Carril 1
        boolean esDivisor2 = (2 % maximo == 0) ? true : false;  // Carril 2
    //Tercer choque
        boolean cantidadPar = (cantidad % 2 == 0) ? true : false;  // Carril 1
        boolean cantidadImpar = (cantidad % 2 != 0) ? true : false; // Carril 2


        Map<String, Integer> minYCant = minimoYCantidad(numeros);

        Map<String, Object> resultado = new HashMap<>();
        resultado.put("maximo", maximo);
        resultado.put("minimo", minYCant.get("minimo"));
        resultado.put("cantidad", minYCant.get("cantidad"));

        resultado.put("esMultiplo2", esMultiplo2);
        resultado.put("esDivisor2", esDivisor2);

        resultado.put("cantidadPar", cantidadPar);
        resultado.put("cantidadImpar", cantidadImpar);
        return resultado;
 
    }

}
