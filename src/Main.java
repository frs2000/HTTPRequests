import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;

public class Main {
    public static void main(String[] args) throws Exception {


            URL url = new URL("https://interestingengineering.com/5-technology-trends-to-watch-in-2019");
            URLConnection uc = url.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream()));

            String inputLine;

            while ((inputLine = in.readLine()) != null)
                System.out.println(inputLine);
            in.close();
        }
}
