package homeTask14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class CustomServer {
    private ServerSocket serverSocket;
    private Socket socket;
    private char[] russianChars = {'ё', 'ъ', 'ы', 'э'};

    public CustomServer(int port) throws IOException {
        serverSocket = new ServerSocket(port);
    }

    public void waitForClientConnection() throws IOException {
        socket = serverSocket.accept();
    }

    public void processClientMessageFromConsole() throws IOException {
        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        String hello = bufferedReader.readLine();

        if (hello.equals("привіт"))
            System.out.println("привіт");

        if (isRussianCharExists(hello)) {
            System.out.println("що таке паляниця?");
            if (!bufferedReader.readLine().equals("хліб")) {
                socket.close();
                serverSocket.close();
                System.exit(0);
            }
        }
        System.out.println(java.time.LocalDateTime.now());
        System.out.println("Bye!");
    }

    private boolean isRussianCharExists(String s) {
        for (char c : russianChars) {
            if (s.toLowerCase().contains("" + c)) return true;
        }
        return false;
    }

}
