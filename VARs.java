import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VARs extends JFrame{
    Calendar calendar;
    Time time; 
    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;
    SimpleDateFormat DATEFormat;
    
    JLabel timeLabel;
    JLabel dayJLabel;
    JLabel datLabel;


    String title = "CALENDER";
    int width = 400;
    int height = 400;
    boolean resizable = false;
    int xlocation  = 600;
    int ylocation = 200;
}
