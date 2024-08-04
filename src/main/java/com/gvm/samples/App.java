package com.gvm.samples;

/**
 * Hello world!
 *
 */
@Controller("/")
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}

// package com.gvm.samples;

// // import org.springframework.boot.SpringApplication;
// // import org.springframework.boot.autoconfigure.SpringBootApplication;
// // import org.springframework.web.bind.annotation.GetMapping;
// // import org.springframework.web.bind.annotation.RequestMapping;
// // import org.springframework.web.bind.annotation.RestController;

// // @SpringBootApplication
// public class App {
//     public static void main(String[] args) {
//         SpringApplication.run(App.class, args);
//     }
// }

// @RestController
// @RequestMapping("/")
// class HelloController {
//     @GetMapping
//     public String sayHello() {
//         return "Hello, GraalVM!";
//     }
// }

// package com.gvm.samples;

// import com.sun.net.httpserver.HttpServer;
// import com.sun.net.httpserver.HttpHandler;
// import com.sun.net.httpserver.HttpExchange;
// import java.io.IOException;
// import java.io.OutputStream;

// public class App {
//     public static void main(String[] args) throws IOException {
//         // Cria o servidor na porta 8080
//         HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
//         // Define o contexto para a raiz ("/")
//         server.createContext("/", new HelloHandler());
//         // Inicia o servidor
//         server.start();
//         System.out.println("Server started on port 8080");
//     }

//     // Handler para lidar com as requisições HTTP
//     static class HelloHandler implements HttpHandler {
//         @Override
//         public void handle(HttpExchange exchange) throws IOException {
//             String response = "Hello, World!";
//             exchange.sendResponseHeaders(200, response.getBytes().length);
//             OutputStream os = exchange.getResponseBody();
//             os.write(response.getBytes());
//             os.close();
//         }
//     }
// }
