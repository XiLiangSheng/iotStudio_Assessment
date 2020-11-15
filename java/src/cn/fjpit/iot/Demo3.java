package cn.fjpit.iot;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        getTime getTime = new getTime();
        System.out.println("输入每堆硬币的个数");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        getTime.getStartTime_ns();
        String[] strings = str.split(",|，");
        int[] coins = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            coins[i] = Integer.parseInt(strings[i]);
        }
        int frequency = 0;
        for (int coin :
                coins) {
            frequency += (coin + 1) / 2;
        }
        System.out.println("最少要来" + frequency + "次商店才能拿完");
        getTime.getEndTime_ns();
        getTime.RunningTime_ns();
    }
}
