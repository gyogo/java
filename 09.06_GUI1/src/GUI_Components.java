import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_Components {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Components");
        JPanel panel = new JPanel();
        JLabel lb = new JLabel("JLabel");
        String [] con= {"glgl","meow"};
        JButton button = new JButton("Jbutton");
        JCheckBox ck1 = new JCheckBox("강아지");
        JComboBox ck0 = new JComboBox(con);
        JCheckBox ck2 = new JCheckBox("고양이");
        JRadioButton rb1 = new JRadioButton("미성년자");
        JRadioButton rb2 = new JRadioButton("성인");
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        JTextField tf0 = new JTextField("JTextField");
        JTextArea ta0 = new JTextArea(2,10);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                button.setText("Cliked");
            }
        });
        panel.add(lb);
        panel.add(button);
        panel.add(ck1);
        panel.add(ck2);
        panel.add(ck0);
        panel.add(rb1);
        panel.add(rb2);
        panel.add(tf0);
        panel.add(ta0);

        frame.add(panel);

        frame.setPreferredSize(new Dimension(600,400));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    }
}
