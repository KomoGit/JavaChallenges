import java.time.temporal.TemporalAdjuster;
import java.util.Calendar;
import java.util.Date;

class Program{

    static Calendar cal = Calendar.getInstance();

    public static void daysFromToday(int days){
        
        cal.add(Calendar.DATE, days);
        Date daysFromNow = cal.getTime();
        System.out.println( days + " days from today will be " + daysFromNow);
    }

    public static void main(String[] args) {
        daysFromToday(100);
    }
}