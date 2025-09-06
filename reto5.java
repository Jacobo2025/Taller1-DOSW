import java.util.*;
import java.util.stream.*;

public class reto5 {

    public static Set<Integer> generarHashSet(List<Integer> numeros) {
        Set<Integer> hashSet = new HashSet<>();
        numeros.forEach(n -> {
            if (n % 3 != 0) {
                hashSet.add(n);
            }
        });
        return hashSet;
    }
}
