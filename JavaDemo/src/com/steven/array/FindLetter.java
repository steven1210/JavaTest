package com.steven.array;

public class FindLetter {
    public static void main(String[] args) {
        String str = "abrdfev123rA evrea";
        char strChar =  'a';
        char strChar2 = 'z';

        findCharCount(str,strChar);

        findCharsCount(str, strChar, strChar2);
    }

//  返回字符串中某一个字母出现的次数
    public static void findCharCount(String str, char strChar){
        int count = 0;
//      将字符串转换成小写字母的数组
        char[] arrays = str.toLowerCase().toCharArray();
        for (int i = 0; i < arrays.length; i++) {
            if(arrays[i] == strChar){
                count = count + 1;
            }
        }
        System.out.println("字符串中字母" + strChar + "出现的次数是：" + count);
    }

//  计算字符串中出现字母的个数
    public static void findCharsCount(String str, char strChar, char strChar2){
        int count = 0;
//      将字符串转换成小写字母的数组
        char[] arrays = str.toLowerCase().toCharArray();
        for (int i = 0; i < arrays.length; i++) {
            if(arrays[i] >= strChar && arrays[i] <= strChar2){
                count = count + 1;
            }
        }
        System.out.println("字符串中出现字母的数量是：" + count);
    }
}
