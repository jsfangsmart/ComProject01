import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Description:
 * Auther:smart
 * Date: 2020/9/23 上午9:09
 */
    public class ComPort {
    private JRadioButton USBComunicationRadioButton;
    private JRadioButton COMComunicationRadioButton;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JButton acceptButton;
    private JPanel MainPanel;
    private JPanel Panel01;
    private JPanel Panel02;
    private JPanel Panel03;
    private JPanel Panel0201;

    public static void main(String[] args) {
        JFrame frame = new JFrame("ComPort");
        frame.setContentPane(new ComPort().MainPanel);
        frame.setSize(600,500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        ComPort port = new ComPort();
        port.USBComunicationRadioButton.setSelected(true);
        port.COMComunicationRadioButton.setSelected(false);

        String strData = null;
        for (int i = 0; i < 10; i++) {
            strData.format("Com%d",i);
            port.comboBox1.addItem(strData);
        }

        port.comboBox2.addItem("115200");
        port.comboBox2.addItem("57600");
        port.comboBox2.addItem("38400");
        port.comboBox2.addItem("9600");

        port.acceptButton.addActionListener(new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"我是消息对话框","标题",JOptionPane.PLAIN_MESSAGE);
            }
        });
    }
}
