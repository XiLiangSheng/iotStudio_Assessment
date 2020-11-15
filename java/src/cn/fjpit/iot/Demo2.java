package cn.fjpit.iot;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        getTime getTime = new getTime();
        System.out.println("请输入奖金的金额");
        Scanner scanner = new Scanner(System.in);
        int money = scanner.nextInt();
        getTime.getStartTime_ns();
        int notes[] = {100, 50, 20, 10, 5, 2, 1};
        for (int i = 0; i < notes.length; i++) {
            int num = money / notes[i];
            money = money % notes[i];
            for (int j = (notes[i] * 10); j < 3; j++) {
                System.out.println();
            }
            System.out.println(notes[i] + "元: " + num + "张");
        }
        getTime.getEndTime_ns();
        getTime.RunningTime_ns();
    }
}
