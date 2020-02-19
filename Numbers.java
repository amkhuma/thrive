import java.util.*;

public class Numbers{
    //assuming that the numbers are passed in as an array.
    public static String repeats(int[] arr){
        String returnString = "";

        List<Integer> listWithDuplicates = new ArrayList<Integer>();

        for (int counter = 0; counter < arr.length; counter++){
            listWithDuplicates.add(arr[counter]);
        } // still has duplicates

        Set<Integer> listWithoutDuplicates = new HashSet<Integer>(listWithDuplicates); //set without duplicates.

        for (int temp : listWithoutDuplicates) {
            returnString = returnString  + temp + " - " + Collections.frequency(listWithDuplicates, temp) + " times \n";
        }

        return returnString;
    }

    public static void main(String[] args) {

        System.out.println(repeats(new int[]{1, 0, 12, 4, 1, 2, 4, 8, 3, 7, 0, 1}));

    }
}