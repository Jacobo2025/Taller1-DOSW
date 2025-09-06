import java.util.*;
import java.util.stream.*;

public class reto5 {

    //HashSet, elimina múltiplos de 3
    public static Set<Integer> generarHashSet(List<Integer> numeros) {
        Set<Integer> hashSet = new HashSet<>();
        numeros.forEach(n -> {
            if (n % 3 != 0) hashSet.add(n);
        });
        return hashSet;
    }

    //TreeSet, elimina múltiplos de 5
    public static Set<Integer> generarTreeSet(List<Integer> numeros) {
        Set<Integer> treeSet = new TreeSet<>();
        numeros.forEach(n -> {
            if (n % 5 != 0) treeSet.add(n);
        });
        return treeSet;
    }

    // Choque final: unir ambas colecciones, eliminar duplicados y ordenar
    public static Set<Integer> unirColecciones(Set<Integer> hashSet, Set<Integer> treeSet) {
        return Stream.concat(hashSet.stream(), treeSet.stream())
                     .collect(Collectors.toCollection(TreeSet::new)); // TreeSet para orden ascendente
    }

    // Imprimir resultados
    public static void imprimirArena(Set<Integer> conjunto) {
        conjunto.forEach(n -> System.out.println("Número en arena: " + n));
    }

    public static void main(String[] args) {
        List<Integer> listaA = Arrays.asList(4, 9, 15, 7, 18, 21, 10, 5);
        List<Integer> listaB = Arrays.asList(12, 3, 25, 10, 7, 30, 18, 4);

        Set<Integer> hashSet = generarHashSet(listaA);
        Set<Integer> treeSet = generarTreeSet(listaB);

        Set<Integer> arenaFinal = unirColecciones(hashSet, treeSet);

        imprimirArena(arenaFinal);
    }
}

