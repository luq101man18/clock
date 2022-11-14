

import javax.swing.JLabel;

import java.awt.*;

public class fram extends VARs {
    time Time = new time();
    day Day = new day();
    year Year = new year();
    

    fram()
    {
        try {
            setUpYourJFrame(EXIT_ON_CLOSE, title, width, height, resizable, xlocation, ylocation);
            setUpJLabelInstances();
            this.add(timeLabel);
            this.add(dayJLabel);
            this.add(datLabel);
            decorateLabel(timeLabel, "verdana", 60, Color.BLACK, Color.CYAN);
            decorateLabel(dayJLabel, "Futura", 55, Color.BLACK, Color.LIGHT_GRAY);
            decorateLabel(datLabel, "Impact", 60, Color.BLACK, Color.CYAN);
            this.setVisible(true);
            UpdateLabel();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void setUpYourJFrame(int CloseTapMethod, String tapTitle, int width, int height, boolean resizable, int locationX, int locationY){
        this.setDefaultCloseOperation(CloseTapMethod);
        this.setTitle(tapTitle);
        this.setSize(width, height);
        this.setResizable(resizable);
        this.setLocation(locationX, locationY);
        this.setLayout(new FlowLayout());

        this.setVisible(true);
    }

    public JLabel createJlabelInstance(){
        JLabel newLabel = new JLabel();
        return newLabel;
    }
    
    public void setUpJLabelInstances(){
        timeLabel = createJlabelInstance();
        dayJLabel = createJlabelInstance();
        datLabel = createJlabelInstance();

    }

    public void UpdateLabel(){
        
        while(true){
            try {
                setLabelsTexts();
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            
        }

    }

    public void decorateLabel(JLabel label, String font, int Size, Color backgroundColor, Color foregroundColor){
        label.setFont(new Font(font, Font.PLAIN,Size));
        label.setBackground(backgroundColor);
        label.setForeground(foregroundColor);
        label.setOpaque(true);
    }

    public void setLabelsTexts(){
        timeLabel.setText(Time.setTime());
        dayJLabel.setText(Day.setDay());
        datLabel.setText(Year.setDate());
    }
}
