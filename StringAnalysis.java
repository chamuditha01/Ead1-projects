public class StringAnalysis {
    public static void main(String[] args) {
        String paragraph = "h11111111111s DHf";

        
        int wordCount = countWords(paragraph);
        System.out.println("Number of words: " + wordCount);

        
        int alphabetCount = countAlphabeticalCharacters(paragraph);
        System.out.println("Number of alphabetical characters: " + alphabetCount);
    }

    private static int countWords(String text) {
        
        String[] words = text.split("\\s+");
        return words.length;
    }

    private static int countAlphabeticalCharacters(String text) {
        
        String onlyAlphabetical = text.replaceAll("[a-zA-Z]", "");
        return onlyAlphabetical.length();
    }
}
