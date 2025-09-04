import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EcoMisterioso{
    public String ecoMisterioso(String palabra){
        StringBuffer sb = new StringBuffer(palabra);
        sb.reverse();
        return sb.toString();
    }
}