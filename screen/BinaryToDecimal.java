package screen;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import controler.BtoDButtonListener;
import model.BtoDCalc;

public class BinaryToDecimal {
	
    private BtoDCalc BtoDCalc = new BtoDCalc();
    private JFrame window;
    private JTextArea display = new JTextArea();
	private JButton enterButton = new JButton("Enter");
    private JButton exitButton = new JButton("Exit");
    private JTextField numField = new JTextField(10);

    public BinaryToDecimal(JFrame window){
        this.window = window;
        window.setTitle("Binary to Decimal");
    }

    public void init(){
        Container cp = window.getContentPane();
        var scrollPane = new JScrollPane(display, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
            JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setPreferredSize(new Dimension(400, 400));
        cp.add(BorderLayout.CENTER, scrollPane);

        JPanel southPanel = new JPanel();
        cp.add(BorderLayout.SOUTH, southPanel);

        southPanel.setLayout(new GridLayout(3,1));
        JPanel row1 = new JPanel();
        row1.add(numField);
        row1.add(enterButton);
        southPanel.add(row1);


		JPanel row3 = new JPanel();
        row3.add(exitButton);
        southPanel.add(row3);

        BtoDButtonListener buttonClickListener = new BtoDButtonListener(this);
		enterButton.addActionListener(buttonClickListener);
		exitButton.addActionListener(buttonClickListener);

    }

    public JButton getEnterButton(){
        return enterButton;
	}
    public JButton getExitButton(){
        return exitButton;
    }
    public JFrame getWindow(){
        return window;
    }

    public BtoDCalc getBtoDCalc(){
		return BtoDCalc;
    }
    public JTextField getNumField(){
        return numField;
    }
    public JTextArea getDisplay(){
        return display;
    }
}
