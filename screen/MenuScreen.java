package screen;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MenuScreen {
	
	private JFrame window;

    public MenuScreen(JFrame window) {
        this.window = window;
        window.setTitle("Conversion Calculator");
	}
	
	public void init() {
        Container cp = window.getContentPane();
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(400, 200));
        panel.setLayout(new GridLayout(4, 1));
		JButton dtoBCalcButton = new JButton("Decimal to Binary");
		JButton btoDCalcButton = new JButton("Binary to Decimal");
		JButton dtoHCalcButton = new JButton("Decimal to Hexadecimal");
		JButton htoDCalcButton = new JButton("Hexadecimal to Decimal");
        panel.add(dtoBCalcButton);
		panel.add(btoDCalcButton);
		panel.add(dtoHCalcButton);
		panel.add(htoDCalcButton);
        cp.add(BorderLayout.CENTER, panel);

		dtoBCalcButton.addActionListener( e -> {
            window.getContentPane().removeAll();
            var calc = new DecimalToBinary(window);
            calc.init();
            window.pack();
            window.revalidate();
		});
		
		btoDCalcButton.addActionListener( e -> {
            window.getContentPane().removeAll();
            var calc = new BinaryToDecimal(window);
            calc.init();
            window.pack();
            window.revalidate();
		});
		
		dtoHCalcButton.addActionListener( e -> {
            window.getContentPane().removeAll();
            var calc = new DecimalToHex(window);
            calc.init();
            window.pack();
            window.revalidate();
		});
		
		htoDCalcButton.addActionListener( e -> {
            window.getContentPane().removeAll();
            var calc = new HextoDecimal(window);
            calc.init();
            window.pack();
            window.revalidate();
		});
    }
}
