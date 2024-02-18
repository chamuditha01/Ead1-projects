public class GenEx {
    public static <K> void printArray(K[] elements) {
        for (K element : elements) {
            System.out.println(element);
        }
    }

    public static void main(String args[]) {
        Integer[] intArray = {10, 20, 30, 40, 50};
        Character[] charArray = {'J', 'A', 'V', 'A', 'T', 'P', 'O', 'I', 'E', 'T'};

        System.out.println("Printing Integer Array");
        printArray(intArray);

        System.out.println("Printing Character Array");
        printArray(charArray);
    }
}