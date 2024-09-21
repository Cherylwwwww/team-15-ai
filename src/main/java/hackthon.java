import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class hackthon {
    public static void main(String[] args) {
        // 创建框架
        JFrame frame = new JFrame("Simple UI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        
        // 创建搜索框
        JTextField searchBar = new JTextField(20);
        
        // 创建按钮
        JButton generateReportButton = new JButton("Generate Report");
        generateReportButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 按钮点击事件
                String searchText = searchBar.getText();
                JOptionPane.showMessageDialog(frame, "Generating report for: " + searchText);
            }
        });
        
        // 布局
        JPanel panel = new JPanel();
        
        // 创建标签
        JLabel patientIdLabel = new JLabel("Patient ID: ");
        panel.add(patientIdLabel); // 添加标签到面板
        panel.add(searchBar);
        panel.add(generateReportButton);
        
        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}
