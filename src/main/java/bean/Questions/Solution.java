package bean.Questions;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by SELPHA on 12/3/2018.
 */
public class Solution {

    public String[] allSwap(String[] list) {
        final Map<Character, Integer> swapped = new HashMap<Character, Integer>();
        for (int i = 0; i < list.length; i++) {
            if (list[i].equals("")) {
                continue;
            }
            final Character firstChar = list[i].charAt(0);
            final Integer potentialIndex = swapped.remove(firstChar);

            if (potentialIndex != null) {
                final int thatIndex = potentialIndex;
                final String temp = list[thatIndex];
                list[thatIndex] = list[i];
                list[i] = temp;
            } else {
                swapped.put(firstChar, i);
            }
        }
        return list;
    }

    public String[]firstSwap(String[]arrayStr){
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i<arrayStr.length; i++) {
            String key = arrayStr[i].substring(0, 1);
            if(!map.containsKey(key)){
                map.put(key, i);
            } else if(!map.get(key).equals(-1)){
                String temp = arrayStr[i];
                arrayStr[i] = arrayStr[map.get(key)];
                arrayStr[map.get(key)] = temp;
                map.put(key, -1);
            }
        }
        return arrayStr;
    }

    public boolean gHappy(String str) {
        if(str.length() == 1 && str.charAt(0) == 'g')
            return false;
        if(str.length() >= 2 &&
                (str.charAt(0) == 'g' && str.charAt(1) != 'g' ||
                        str.charAt(str.length()-1) == 'g' &&
                                str.charAt(str.length()-2) != 'g'))
            return false;
        for(int i = 1; i <= str.length() - 2; i++) {
            if(str.charAt(i) == 'g' && str.charAt(i-1) != 'g' &&
                    str.charAt(i+1) != 'g')
                return false;
        }
        return true;
    }


    public String mirrorEnds(String string) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < string.length(); i++) {
            if(string.charAt(i) == string.charAt(string.length() - i - 1))
                result.append(string.charAt(i));
            else
                break;
        }
        return result.toString();
    }
}
