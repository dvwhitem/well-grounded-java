import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.Charset;
import java.util.concurrent.CompletableFuture;

public class HTTP2Check {

    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {


        // Synchronous request
        //synchronousRequest();

        // Asynchronous request
        asynchronousRequest();
    }

    public static void asynchronousRequest() throws URISyntaxException {
        var client = HttpClient.newBuilder().build();
        var uri = new URI("https://google.com");
        var request = HttpRequest.newBuilder(uri).build();
        var handler = HttpResponse.BodyHandlers.ofString();
        CompletableFuture.allOf(
                client.sendAsync(request, handler)
                        .thenAccept((resp) -> System.out.println(resp.body())),
                client.sendAsync(request, handler)
                        .thenAccept((resp) -> System.out.println(resp.body())),
                client.sendAsync(request, handler)
                        .thenAccept((resp) -> System.out.println(resp.body())),
                client.sendAsync(request, handler)
                        .thenAccept((resp) -> System.out.println(resp.body()))
        ).join();
    }

    public static void synchronousRequest() throws URISyntaxException, IOException, InterruptedException {
        var client = HttpClient.newBuilder().build();
        var uri = new URI("https://google.com");
        var request = HttpRequest.newBuilder(uri).build();

        var  response = client.send(
                request,
                HttpResponse.BodyHandlers.ofString(Charset.defaultCharset())
        );

        System.out.println("Response: "+ response.body());
    }
}
