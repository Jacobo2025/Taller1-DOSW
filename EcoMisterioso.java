import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EcoMisterioso {
    public String ecoMisterioso(String palabra){
        StringBuilder sb = new StringBuilder(IntStream.range(0,3).mapToObj(i -> palabra).collect(Collectors.joining("")));
        return sb.toString();
    }
}
