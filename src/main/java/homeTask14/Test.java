package homeTask14;

import java.io.IOException;

public class Test {

    public static void main(String[] args) throws IOException {
        CustomServer server = new CustomServer(8081);
        server.waitForClientConnection();
        server.processClientMessageFromConsole();
    }

    /*
    Commands for Terminal:

    Case 1:
    nc localhost 8081
    привіт

    Case 2:
    nc localhost 8081
    ё
    хліб

    Case 3:
    nc localhost 8081
    ё
    ё

    */
}
