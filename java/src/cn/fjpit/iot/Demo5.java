package cn.fjpit.iot;

import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        getTime getTime = new getTime();
        System.out.println("定义矩阵的行和列");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] ranks = str.split(" |,|，");
        int[][] data = new int[Integer.parseInt(ranks[0])][Integer.parseInt(ranks[1])];
        System.out.println("输入矩阵内的数值");
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = scanner.nextInt();
            }
        }
        getTime.getStartTime_ns();
        int a = 0, b = 0;
        for (int i = 1; i < data.length; i++) {
            for (int j = 1; j < data[i].length; j++) {
                if (data[i][j] != data[i - 1][j - 1]) {
                    a += 1;
                } else {
                    b += 1;
                }
            }
        }
        if (a > 0) {
            System.out.println("对角线的值不相等");
        } else {
            System.out.println("对角线的值相等");
        }
        getTime.getEndTime_ns();
        getTime.RunningTime_ns();
    }
}
