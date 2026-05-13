import code.numbers.NumberFinder;
import code.string.ExtractString;

public class KeithClass {

    // Required platform execution entry endpoint
    public String getInput(String conversation) {
        // 1. Process and extract Keith Composite chains from pure numerical patterns
        String part1 = NumberFinder.findKeithComposites(conversation);
        
        // 2. Sum up any literal alphabetic word metrics found embedded inside
        String part2 = ExtractString.sumTextNumbers(conversation);
        
        // 3. Chain components systematically to derive output string formatting
        return part1 + part2;
    }
}



