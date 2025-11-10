import java.io.*;
import java.net.*;

public class OrderServer {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(5000);
        System.out.println("Server waiting for orders...");
        Socket s = ss.accept();

        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String orderDetails = br.readLine();
        System.out.println("Received Order: " + orderDetails);

        PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
        pw.println("Order received and being processed!");
        ss.close();
    }
}