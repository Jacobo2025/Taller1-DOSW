import java.util.*;
import java.util.stream.*;

public class CarreraParalela {
    // Función para encontrar el máximo
    public static int encontrarMaximo(List<Integer> numeros) {
        return numeros.stream()
                      .max(Integer::compareTo)
                      .orElseThrow(() -> new IllegalArgumentException("Lista vacía"));
    }

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(3, 8, 1, 6, 10, 2);
        System.out.println("Máximo: " + encontrarMaximo(numeros));
    }
}
