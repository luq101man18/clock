
import java.text.SimpleDateFormat;
import java.util.Calendar;



public class time extends VARs{

    public SimpleDateFormat getTimeFormat(){
        timeFormat = new SimpleDateFormat("hh:mm:ss a");

        return timeFormat;
    }
    public String setTime(){
        String timeText  = getTimeFormat().format(Calendar.getInstance().getTime());

        return timeText;
    }
    
    
    
    
}
