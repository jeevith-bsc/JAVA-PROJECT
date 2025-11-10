import java.io.*;
import java.net.*;

public class OrderClient {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 5000);
        PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
        pw.println("2 Burgers, 1 Coke");

        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        System.out.println("Server: " + br.readLine());
        s.close();
    }
}
