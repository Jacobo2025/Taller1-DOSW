import java.util.*;

public class CarreraParalela {
    public static Map<String, Integer> minimoYCantidad(List<Integer> numeros) {

        int minimo = numeros.stream()
                            .min(Integer::compareTo)
                            .get();

        long cantidad = numeros.stream()
                               .count();

        Map<String, Integer> resultado = new HashMap<>();
        resultado.put("minimo", minimo);
        resultado.put("cantidad", (int) cantidad);
        return resultado;
    }

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(4, 2, 7, 2, 5);

        Map<String, Integer> res = minimoYCantidad(numeros);
        System.out.println(res); 
    }
}


