package run.halo.app.sealien;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 * @author ll
 * @Description TODO
 * @date 2019/12/17
 */
public class MemorialTest {
    private static SimpleDateFormat FORMAT = new SimpleDateFormat("yyyy-MM-dd");
    public static void main(String []args) {
        System.out.println("今天是第" + getInterval("2019-02-05",FORMAT.format(new Date())) + "天");
    }

    private static long getInterval(String start, String end) {
        LocalDate startDate = LocalDate.parse(start);
        LocalDate endDate = LocalDate.parse(end);
        return startDate.until(endDate, ChronoUnit.DAYS);
    }
}
