import javax.swing.*;
import java.awt.*;

public class GUI3_layout {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        FlowLayout f1 = new FlowLayout(); //어떤 패널에 어떤 레이아웃을 어떻게 배치할 것인가?
        //FLOWLAYOUT은 JPANEL의 기본 레이아웃
        f1.setAlignment(FlowLayout.LEFT); //왼쪽으로 옮기깅
        panel.setLayout(f1);

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
