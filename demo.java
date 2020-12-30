import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

public class demo implements ActionListener {
    private JLabel label = new JLabel("TASK:");
    private JFrame frame = new JFrame();

    public demo() {
        label.setVerticalAlignment(JLabel.TOP);
        label.setFont(new Font("Verdana", Font.PLAIN, 20));
        label.setPreferredSize(new Dimension(750, 100));
        label.setForeground(new Color(120, 90, 40));
        label.setBackground(new Color(100, 20, 70));
        Border border = BorderFactory.createLineBorder(Color.ORANGE);
        label.setBorder(border);
        frame.add(label);
        frame.setSize(600, 300);
        frame.setVisible(true);

        // the clickable button
        JButton button = new JButton("CLICK ME");
        button.setFont(new Font("Verdana", Font.PLAIN, 15));
        button.addActionListener(this);

        // the panel with the button and text
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);

        // set up the frame and display it
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("RANDOM TASK GENERATOR");
        frame.pack();
        frame.setVisible(true);
    }

    // process the button clicks
    public void actionPerformed(ActionEvent e) {
        DateFormat dateFormat = new SimpleDateFormat("HH");
        Calendar cal = Calendar.getInstance();
        String stringTime = dateFormat.format(cal.getTime());
        int time = convertStringToInt(stringTime);
        System.out.println(time);
        if (time >= 07) {

            String[] arr = {
                    "Play a exercise related video game!",
                    "Play a board game together.",
                    "Have an impromptu living room dance party.",
                    "Enjoy a picnic.",
                    "Read a book.",
                    "Write a letter to someone you know.",
                    "Learn a new language.",
                    "Play a card game.",
                    "Watch an educational related tv show and talk about it after.",
                    "Video Chat with someone.",
                    "Play a game with someone else remotely!",
                    "Watch a movie together with someone remotely!",
                    "Try doing a new science experiement!",
                    "Have boxes? Build something amazing with them!",
                    "Learn to code!",
                    "Go outside for a walk!",
                    "Organize closets.",
                    "Start meal planning for the week.",
                    "Complete a painting in one day.",
                    "Go for a run now.",
                    "Watch a horror movie!",
                    "Do 100 pushups!",
                    "Watch the night sky.",
                    "Go to gym and workout!",
                    "Meditate for 1 hour.",
                    "Visit a friend's house and surprise him!",
                    "Go to a club you have never been to!",
                    "Cook your favourite dish without a recipe.",
                    "Turn off social media for a day/week!",
                    "Organize a potluck party with your friends.",
                    "Prank call a friend!",
                    "Find a movie with very bad reviews and ratings, now watch it!",
                    "Buy the cheapest things you can buy on amazon.",
                    "Pretend to be a vlogger and make a vlog.",
                    "Write a poem about your favourite season!",
                    "Go to a museum.",
                    "Learn a Magic trick and show off!",
                    "Delete your Facebook account!"};
            Random random = new Random();

            // randomly selects an index from the arr
            int select = random.nextInt(arr.length);

            // prints out the value at the randomly selected index
            System.out.println("Random String selected: " + arr[select]);

            label.setText("TASK: " + arr[select]);
        } else {
            label.setText("TASK: YOU SHOULD SLEEP NOW");
        }
    }

    private static int convertStringToInt(String number) {
        return Integer.parseInt(number);
    }

    // create one Frame
    public static void main(String[] args) {
        new demo();
    }
}