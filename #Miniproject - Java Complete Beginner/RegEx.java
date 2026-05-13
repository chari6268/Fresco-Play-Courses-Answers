package com.fresco;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {

    public String findCardTypeNumbers(String input1, String input2) {

        String regex = "";

        switch (input2) {

            case "Visa":
                regex = "(?<!\\d)4\\d{12}(\\d{3})?(?!\\d)";
                break;

            case "American Express":
                regex = "(?<!\\d)3[47]\\d{13}(?!\\d)";
                break;

            case "Discover":
                regex = "(?<!\\d)(6011\\d{12}|65\\d{14})(?!\\d)";
                break;

            case "JCB":
                regex = "(?<!\\d)(2131\\d{11}|1800\\d{11}|35\\d{14})(?!\\d)";
                break;

            default:
                return "Not a valid card type";
        }

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input1);

        ArrayList<String> list = new ArrayList<>();

        while (m.find()) {
            list.add(m.group());
        }

        return String.join(" ", list);
    }
}
