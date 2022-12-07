/**
* Advent of Code 2022, Day 1
*
* @autor  Matteo Bruscagnin
* @version  1.1
*/


import java.io.*;
import java.util.*;

public class DayOne {
	private static ArrayList<String> raw;
	private static BufferedReader reader;

	public static void inputData() {
		raw = new ArrayList<String>();
		try {
			reader = new BufferedReader(new FileReader("input1.txt"));
			while(reader.ready()){
			    raw.add(reader.readLine());
			}
			reader.close();
		}
		catch ( IOException e) {}
	}
/**
* Returns the maximum sum of calories carried by an elf in the set.
* <p>
* This method sum the elements in the collections and check 
* if an element of the ArrayList is not a number, then check if 
* the sum is bigger than the max.
*
* @return      int max calories carried by an elf
* @see         java.util.ArrayList
*/
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
/**
* Returns the maximum sum of the three top MaxCalories.
* <p>
* This method sum the elements in the collections and check 
* if an element of the ArrayList is not a number, then check if 
* the sum is bigger than the max.
*
* @return      int sum of max calories carried by the top three elves.
* @see         java.util.ArrayList
*/
	public static int topThreeElves(){
		ArrayList<Integer> sums = new ArrayList<Integer>();
		int i = 0;
		int partialSum = 0;
		while(i < raw.size()-1){
            if( !isNumeric(raw.get(i)) ){
		        sums.add(partialSum);
		        partialSum = 0;
		    }
		    partialSum += Integer.parseInt( raw.get(i) );		   
        }
        Collections.sort(sums);
        return sums.get(sums.size()-1)+sums.get(sums.size()-2)+sums.get(sums.size()-3);
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
    	inputData();
		System.out.println("The most calories carried by one elf: "+topFirstElf());
		System.out.println("The most calories carried by the top three elves: "+topThreeElves());

    }

}
