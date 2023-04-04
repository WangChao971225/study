package com.wangchao.javaee.course06_common.string.algo;

import org.junit.Test;

/**
 * 关于String的常见算法题
 *
 * @author Wang Chao
 * @create 2023/1/10 18:50
 */
public class AlgoTest {
    /**
     * 模拟一个trim方法，取出字符串两端的空格。
     */
    @Test
    public void test1() {
        String str = "   ab cd   ";
        str.trim();
        String trim = trim(str);
        System.out.println(trim);
    }

    public String trim(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < str.length()) {
            if (str.charAt(left) == ' ') {
                left++;
            } else {
                break;
            }
        }
        while (right > left) {
            if (str.charAt(right) == ' ') {
                right--;
            } else {
                break;
            }
        }
        return str.substring(left, right + 1);
    }

    /**
     * 将一个字符串进行反转。将字符串中指定部分进行反转。
     * 比如“abcdefg” 反转为“abfedcg”
     */
    @Test
    public void test2() {
        String str = "abcdefg";
        String reverse = reverse(str, 2, 6);
        System.out.println(reverse);
    }

    public String reverse(String str, int st, int ed) {
        if (str.length() <= 1) {
            return str;
        }
        char[] strArr = str.toCharArray();
        String part = str.substring(st, ed);

        for (int i = part.length(); i > 0; i--) {
            strArr[st++] = part.charAt(i - 1);
        }

        return new String(strArr);
    }

    /**
     * 获取一个字符串在另一个字符串中出现的次数
     * 比如：获取"ab"在"abkkcadkabkebfkabkskab"中出现的次数(4)
     */
    @Test
    public void test3() {
        String str = "aaabaaab";
        System.out.println(appearCounts(str, "ab"));
    }

    public int appearCounts(String str, String part) {
        int index = 0;
        int order = 0;
        int count = 0;

        while (index < str.length()) {
            if (str.charAt(index) == part.charAt(order) ) {
                index++;
                if (order < part.length() - 1) {
                    order++;
                } else if (order == part.length() - 1) {
                    order = 0;
                    count++;
                }
            } else if (str.charAt(index) != part.charAt(order)) {
                if (order != 0) {
                    order = 0;
                } else {
                    index++;
                }
            }

        }
        return count;
    }
}
