import java.net.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class HttpServer {
    public static void main(String[] args) throws IOException {
        String imagePath = "C:\\Users\\João Santos\\IdeaProjects\\SocketJavaTCP\\src\\meme.png";
        int port = 1234;
        ServerSocket serverSocket = new ServerSocket(port);
        System.err.println("Servidor rodando na porta: " + port);

        while (true)
        {
            Socket client = serverSocket.accept();
            System.err.println("Cliente Conectado! :)");

            BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
            String s;
            while ((s = in.readLine()) !=null )
            {
                System.out.println(s);
                if (s.isEmpty())
                {
                    break;
                }
            }
            OutputStream clientOutput = client.getOutputStream();
            clientOutput.write("HTTP/1.1 200 OK\r\n".getBytes());
            clientOutput.write("\r\n".getBytes());
            clientOutput.write("<h1> Socket é top eeeeem </h1>".getBytes());
            clientOutput.write("\r\n\r\n".getBytes());
            clientOutput.flush();

            System.err.println("Conexão de Cliente fechada! :(");
            in.close();
            clientOutput.close();
        }
    }
}
