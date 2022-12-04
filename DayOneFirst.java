import java.io.*;
import java.util.*;

public class DayOneFirst {
    public static void main(String[] args) throws Exception {
		ArrayList<String> raw = new ArrayList<String>();
		int next = 0;
		try {
			BufferedReader reader = new BufferedReader(new FileReader("input1.txt"));
			while(reader.ready()){
			    raw.add(reader.readLine());
			}
			reader.close();
			int sum = 0;
			int max = 0;
			int i = 0;
			while(i < raw.size()-1){
                if( !isNumeric(raw.get(i)) ){
                    if(sum > max)
                        max = sum;
                    sum = 0;
                    i++;
                }
                 sum += Integer.parseInt(raw.get(i));
                i++;
            }
            System.out.println(max);
		}
		catch ( IOException e) {}
    }
    private static boolean isNumeric(String str){
        return str != null && str.matches("[0-9.]+");
        }
}
