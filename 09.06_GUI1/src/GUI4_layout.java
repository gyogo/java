import javax.swing.*;
import java.awt.*;

public class GUI4_layout {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        GridLayout g1 = new GridLayout(2,3); //어떤 패널에 어떤 레이아웃을 어떻게 배치할 것인가?
        //FLOWLAYOUT은 JPANEL의 기본 레이아웃
        panel.setLayout(g1);

        for(int i=0; i<6; i++){
            JButton bt = new JButton("Button"+i);
            panel.add(bt);
        }

        frame.add(panel);

        frame.setPreferredSize(new Dimension(600,400));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    }
}
