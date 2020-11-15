package cn.fjpit.iot;

public class getTime {
    private long startTime_ns;
    private long endTime_ns;
    private long startTime_ms;
    private long endTime_ms;

    public static void main(String[] args) {

    }

    /**
     * 获取纳秒开始时间
     *
     * @return
     */
    public long getStartTime_ns() {
        startTime_ns = System.nanoTime();
        return startTime_ns;
    }

    /**
     * 获取毫秒开始时间
     *
     * @return
     */
    public long getStartTime_ms() {
        startTime_ms = System.currentTimeMillis();
        return startTime_ms;
    }

    /**
     * 获取纳秒结束时间
     *
     * @return
     */
    public long getEndTime_ns() {
        endTime_ns = System.nanoTime();
        return endTime_ns;
    }

    /**
     * 获取毫秒结束时间
     *
     * @return
     */
    public long getEndTime_ms() {
        endTime_ms = System.currentTimeMillis();
        return endTime_ms;
    }

    /**
     * 输出纳秒时间
     */
    public void RunningTime_ns() {
        System.out.println();
        System.out.println((endTime_ns - startTime_ns) + "ns");
    }

    /**
     * 输出毫秒时间
     */
    public void RunningTime_ms() {
        System.out.println();
        System.out.println((endTime_ms - startTime_ms) + "ms");
    }

}
