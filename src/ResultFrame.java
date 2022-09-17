import javax.swing.*;

public class ResultFrame {

    JFrame resultFrame;
    JPanel resultPanel;
    JLabel resultLabel;

    public ResultFrame() {
        resultFrame = new JFrame();
        resultPanel = new JPanel();
        resultLabel = new JLabel("Your result is in the result.txt!");

        resultPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        resultPanel.add(resultLabel);

        resultFrame.add(resultPanel);
        resultFrame.setResizable(false);
        resultFrame.setTitle("Result is ready");
        resultFrame.pack();
        resultFrame.setVisible(true);


    }
}
