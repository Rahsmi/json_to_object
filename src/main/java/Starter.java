import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.URL;

public class Starter {
    public static void main(String[] args) throws IOException {
        ObjectMapper om = new ObjectMapper();
        URL url = Thread.currentThread().getContextClassLoader().getResource("jsonString.txt");

        Root root;
        if (url != null) {
            root = om.readValue(url, Root.class);
            System.out.println(root.list.size());
        }
    }
}


