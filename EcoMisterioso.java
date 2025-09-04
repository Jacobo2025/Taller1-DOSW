import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class EcoMisterioso {
    public void ecoMisterioso(String palabra){
        StringBuilder repetido = new StringBuilder(IntStream.range(0,3).mapToObj(i -> palabra).collect(Collectors.joining("")));

        StringBuffer sb = new StringBuffer(repetido);
        sb.reverse();
        return sb.toString();
    }
}

