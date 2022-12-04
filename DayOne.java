/**
* Advent of Code 2022, Day 1
*
* @autor  Matteo Bruscagnin
* @version  1.1
*/


import java.io.*;
import java.util.*;

public class DayOne {
	private ArrayList<String> raw;
	private BufferedReader reader;

	public DayOne() throws IOException{
		this.raw = new ArrayList<String>();
		try {
			this.reader = new BufferedReader(new FileReader("input1.txt"));
			while(this.reader.ready()){
			    this.raw.add(reader.readLine());
			}
			this.reader.close();
		}
		catch ( IOException e) {}
	}

	public static int topFirstElf(){
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
        return max;
	}

	public static int topThreeElves(){
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
        System.out.println("The sum of first three: "+max);

	}

/**
* Returns True if the input exists and matches the RegEx.
* <p>
* This method always returns immediately, whether or not the 
* string exists. 
*
* @param  str  the string to check
* @return      boolean
* @see         java.util.Matcher
*/
    private static boolean isNumeric(String str){
        return str != null && str.matches("[0-9.]+");
        }

    public static void main(String[] args) {
		System.out.println("The most calories carried by one elf: "+topFirstElf());

    }

}
