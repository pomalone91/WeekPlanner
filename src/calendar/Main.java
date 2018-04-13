package calendar;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Read in the file

        // Parse out the events into their proper days

        // Use array list for each day full of events
        List<Event> monday = new ArrayList<>(Arrays.asList());

        // Generate the calendar GUI, use a constructor that passes the array lists as arguments?
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    WeekView frame = new WeekView();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });


        // Write out the calendar file
    }
}
