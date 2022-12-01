import java.net.*;
import java.io.*;

public class DataReader {
    protected int data[];
    public void scraping() throws Exception {

        URL input = new URL("https://adventofcode.com/2022/day/1/input");
        BufferedReader in = new BufferedReader(
        new InputStreamReader(input.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();
    }
}

public class SumCalories{
    
