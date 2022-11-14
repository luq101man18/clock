
import java.text.SimpleDateFormat;
import java.util.Calendar;




public class day extends VARs{
    
    public SimpleDateFormat getDayFormat(){
        dayFormat = new SimpleDateFormat("EEEE");

        return dayFormat;
    }


    public String setDay(){
        String dayText = getDayFormat().format(Calendar.getInstance().getTime());

        return dayText;
    }

}
