public class StringOperations {
    public static void main(String[] args) {
        String text = "NIBM Galle Branch";

        
        int length = text.length();
        System.out.println("Length: " + length); // Output: Length: 17

        
        String substring = text.substring(5);
        System.out.println("Substring: " + substring); // Output: Substring: Galle Branch

        
        int indexOfB = text.indexOf('B');
        System.out.println("Index of 'B': " + indexOfB); // Output: Index of 'B': 5

        
        char charAt5 = text.charAt(5);
        System.out.println("Character at index 5: " + charAt5); // Output: Character at index 5: G

       
        String upperCaseText = text.toUpperCase();
        System.out.println("Uppercase: " + upperCaseText); // Output: Uppercase: NIBM GALLE BRANCH

        
        String replacedText = text.replaceAll("Branch", "");
        System.out.println("Replaced: " + replacedText); // Output: Replaced: NIBM Galle
    }
}
