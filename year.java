
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class year extends VARs {

    
    public SimpleDateFormat getDateFormat(){
        DATEFormat = new SimpleDateFormat("MM/d/yyyy");

        return DATEFormat;
    }
    public String setDate(){
        String DateText  = getDateFormat().format(Calendar.getInstance().getTime());

        return DateText;
    }
    
    

}
