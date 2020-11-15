package cn.fjpit.iot;

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        System.out.println("定义棋盘的大小");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] ranks = str.split(" |,|，");
        int[][] data = new int[Integer.parseInt(ranks[0])][Integer.parseInt(ranks[1])];
        System.out.println("设置棋盘内的数据");
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = scanner.nextInt();
            }
        }
        getTime getTime = new getTime();
        getTime.getStartTime_ns();
        boolean[] a = new boolean[data.length];
        boolean[] b = new boolean[data[0].length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                if (data[i][j] == 1) {
                    a[i] = true;
                    b[j] = true;
                }
            }
        }
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                if (a[i] || b[j]) {
                    data[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }
        getTime.getEndTime_ns();
        getTime.RunningTime_ns();
    }
}
