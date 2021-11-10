import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmojiGUI {

    //ADD BOOLEAN FLAG

    JPanel panel;

    public EmojiGUI(){
        JFrame frame = new JFrame("Emoji Chooser");
        frame.setSize(400, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        panel = new EmojiPanel();
        JButton smile = new JButton("Click to Smile");
        JButton frown = new JButton("Click to Frown");

        smile.addActionListener(new SmileyListener());
        frown.addActionListener(new FrowneyListener());

        panel.add(smile);
        panel.add(frown);

        frame.add(panel);
        frame.setVisible(true);
    }

    private class EmojiPanel extends JPanel{

        public EmojiPanel(){
            setBackground(Color.black);
        }

        public void paintComponent(Graphics g){

            super.paintComponent(g);

            g.setColor(new Color(255, 204, 77));
            g.fillOval(15, 200, 350, 350);

            g.setColor(new Color(102, 69, 0));
            g.fillOval(100, 300, 50, 75);
            g.fillOval(225, 300, 50, 75);

            Graphics2D g2 = (Graphics2D) g;
            g2.setStroke(new BasicStroke(10));

            //If Statement to switch between Smile and Frown

            //Smile
            g2.drawArc(100, 375, 175, 100, 180, 180);

            //Frown
            g2.drawArc(100, 400, 175, 100, 180, -180);

        }
    }

    private class SmileyListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent actionEvent) {

            //SET THE FLAG SMILE = TRUE

            panel.repaint();
        }
    }

    private class FrowneyListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent actionEvent) {

            //SET THE FLAG  SMILE = FALSE

            panel.repaint();
        }
    }

}
