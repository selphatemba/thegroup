package bean.Questions;

import java.util.Arrays;

/**
 * Created by SELPHA on 12/3/2018.
 */
public class Main {
    public static void main(String[] args) {
        String[]list={"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};
        String[]list1={"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};
    Solution solution=new Solution();
        System.out.println(Arrays.toString(solution.allSwap(list)));
        System.out.println(Arrays.toString(solution.firstSwap(list1)));
        System.out.println(solution.gHappy("phuytrggghygg"));
        System.out.println(solution.mirrorEnds("abyuiuhgfba"));

    }
}
