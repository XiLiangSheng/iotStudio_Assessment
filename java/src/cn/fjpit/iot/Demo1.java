package cn.fjpit.iot;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        getTime getTime = new getTime();
        System.out.println("请输入单词或英文字母");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        getTime.getStartTime_ns();
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        String[] letter = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String[] LETTER = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String[] get = new String[str.length()];
        for (int i = 0; i < get.length; i++) {
            get[i] = String.valueOf(str.charAt(i));
        }
        System.out.print(str + "的摩斯密码是:");
        for (int i = 0; i < get.length; i++) {
            for (int j = 0; j < letter.length; j++) {
                if (get[i].equals(letter[j]) || get[i].equals(LETTER[j])) {
                    System.out.print(morse[j]);
                }
            }
        }
        getTime.getEndTime_ns();
        getTime.RunningTime_ns();
    }
}
