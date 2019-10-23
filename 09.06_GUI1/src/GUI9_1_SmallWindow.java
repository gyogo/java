import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI9_1_SmallWindow {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JButton bt1 = new JButton("작은 창 1");
        JButton bt2 = new JButton("작은 창 2");

        JDialog dialog = new JDialog(frame,"다이얼로구",true);
        JLabel lb = new JLabel("레이블");
        dialog.add(lb);
        dialog.setSize(new Dimension(100,200));

        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
//                JOptionPane.showMessageDialog(frame,"메시지","제육",JOptionPane.INFORMATION_MESSAGE);
//                int select = JOptionPane.showConfirmDialog(null,"저장할까요?");
//                System.out.println(select);
                JOptionPane.showInputDialog(
                        frame,"ㄴㅓ의 행운의 번호는?"
                );
            }
        });
        bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                dialog.setVisible(true);
            }
        });



        panel.add(bt1);
        panel.add(bt2);
        frame.add(panel);

        frame.setPreferredSize(new Dimension(600,400));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    }
}
