
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class lambdachallange {

    private static String[] myArray ={"Alice", "Bob", "Charlie", "David", "Eva"};
    private static Random random = new Random();
    public static void main (String[] args )
    {

        Arrays.setAll(myArray, (n)-> myArray[n].toUpperCase());
        System.out.println(Arrays.toString(myArray));

        List<String > backByArray = Arrays.asList(myArray);
        backByArray.replaceAll(s-> s+ " " +getRandomChar(65,75)+ ".");
       backByArray.forEach(s -> System.out.println(s));


    }
    private static char getRandomChar (int i, int j){

        return (char) random.nextInt(i,j);
    }
}