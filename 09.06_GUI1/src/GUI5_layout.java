import javax.swing.*;
import java.awt.*;

public class GUI5_layout {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        BorderLayout bl = new BorderLayout(); //어떤 패널에 어떤 레이아웃을 어떻게 배치할 것인가?
        //FLOWLAYOUT은 JPANEL의 기본 레이아웃
        panel.setLayout(bl);

        JButton b1 = new JButton("Button"+0);
        JButton b2 = new JButton("Button"+1);
        JButton b3 = new JButton("Button"+2);
        JButton b4 = new JButton("Button"+3);
        JButton b5 = new JButton("Button"+4);
        JButton b6 = new JButton("Button"+5);
        panel.add(b1,BorderLayout.NORTH);
        panel.add(b2,BorderLayout.WEST);
        panel.add(b3,BorderLayout.CENTER);
        panel.add(b4,BorderLayout.EAST);
        panel.add(b5,BorderLayout.SOUTH);
        panel.add(b6,BorderLayout.NORTH); //같은 위치에 겹쳤을 때 마지막껄로 보임

        frame.add(panel);

        frame.setPreferredSize(new Dimension(600,400));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    }
}
