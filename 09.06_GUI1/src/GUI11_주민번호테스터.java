import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI11_주민번호테스터 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JTextField tf0 = new JTextField(10);
        JLabel IbMinus = new JLabel("-");
        JTextField tf1 = new JTextField(10);
        JButton btTest = new JButton("테스트");
        btTest.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String jm = tf0.getText()+tf1.getText();
                if(isGood(jm)){
                    IbMinus.setText("O");
                }else{
                    IbMinus.setText("X");
                }
            }
        });
        panel.add(tf0);
        panel.add(IbMinus);
        panel.add(tf1);
        panel.add(btTest);
        frame.add(panel);

        frame.setPreferredSize(new Dimension(600,400));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    }

    private static boolean isGood(String jm) {
        int[] muIn = {2,3,4,5,6,7,8,9,2,3,4,5};
        int sum=0;
        for(int i=0; i<jm.length()-1; i++){
           sum+= (jm.charAt(i) - '0')* muIn[i];
        }
        System.out.println(sum);
        int last = (11-(sum%11))% 10;
        return (jm.charAt(jm.length()-1)-'0') == last;
    }
}
