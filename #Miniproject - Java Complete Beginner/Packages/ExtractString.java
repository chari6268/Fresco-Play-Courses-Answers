package code.string;

public class ExtractString {

    // Converts lowercase text numbers (one to nine) to digit sums
    public static String sumTextNumbers(String conversation) {
        // Sanitize the conversation text to uniform lowercase and drop punctuation marks
        String cleanText = conversation.toLowerCase().replaceAll("[.,?!:]", " ");
        String[] words = cleanText.split("\\s+");
        
        int totalSum = 0;
        for (String word : words) {
            totalSum += wordToDigit(word);
        }
        
        return String.valueOf(totalSum);
    }

    // Simple dictionary parsing map for text tokens
    private static int wordToDigit(String word) {
        switch (word) {
            case "one": return 1;
            case "two": return 2;
            case "three": return 3;
            case "four": return 4;
            case "five": return 5;
            case "six": return 6;
            case "seven": return 7;
            case "eight": return 8;
            case "nine": return 9;
            default: return 0;
        }
    }
}
