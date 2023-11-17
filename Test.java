import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = """
                asdadasdasdasdassadsssssssssssss
                ASdasda,wsg
                asdadasdasdasdassadsssssssssssss                asdadasdasdasdassadsssssssssssss
                asdadasdasdasdassadsssssssssssss
                asdadasdasdasdassadsssssssssssss

                wsg
                """;
        var a = 'd';
        System.out.print(line);
    }
}