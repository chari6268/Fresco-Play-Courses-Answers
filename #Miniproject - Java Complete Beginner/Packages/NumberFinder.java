package code.numbers;

import java.util.ArrayList;
import java.util.List;

public class NumberFinder {

    public static String findKeithComposites(String conversation) {
        StringBuilder result = new StringBuilder();
        
        // Regex splits text by non-digit sequences to extract integers safely
        String[] tokens = conversation.split("[^0-9]+");
        
        for (String token : tokens) {
            if (!token.isEmpty()) {
                int num = Integer.parseInt(token);
                if (isKeithComposite(num)) {
                    result.append(num);
                }
            }
        }
        return result.toString();
    }

    public static boolean isKeithComposite(int num) {
        return isComposite(num) && isKeith(num);
    }

    private static boolean isComposite(int num) {
        if (num <= 3) return false; 
        int factors = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors++;
            }
        }
        return factors > 2;
    }


    private static boolean isKeith(int num) {
        String s = Integer.toString(num);
        int n = s.length();
        
	if (num < 10) return false;

        List<Integer> terms = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            terms.add(Character.getNumericValue(s.charAt(i)));
        }

        while (true) {
            int nextSum = 0;
            for (int i = terms.size() - n; i < terms.size(); i++) {
                nextSum += terms.get(i);
            }
            
            if (nextSum == num) return true;
            if (nextSum > num) return false;
            
            terms.add(nextSum);
        }
    }
}