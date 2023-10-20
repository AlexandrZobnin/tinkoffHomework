package edu.hw1;

import java.util.ArrayList;
import java.util.List;

class Task4 {

    private Task4() {}

    public static String fixString(String str) {
        List<String> pairs = new ArrayList<>();

        for (int start = 0; start < str.length(); start += 2) {
            String pair = str.substring(start, Math.min(str.length(), start + 2));
            if (pair.length() == 2) {
                pair = String.valueOf(pair.charAt(1)) + pair.charAt(0);
            }
            pairs.add(pair);
            }

        String result = String.join("", pairs);
        return result;

    }
}
