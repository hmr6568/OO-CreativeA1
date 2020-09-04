package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import screen.DecimalToBinary;
import screen.MenuScreen;

public class ButtonClickListener implements ActionListener {
	private DecimalToBinary panel;

    public ButtonClickListener(DecimalToBinary panel){
        this.panel =panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       var button = e.getSource();
       String m = panel.getDisplay().getText() + "\n";
       if (button == panel.getExitButton()){
           JFrame window = panel.getWindow();
           window.getContentPane().removeAll();
           var menu = new MenuScreen(window);
           menu.init();
           window.pack();
           window.setVisible(true);

       }else if (button == panel.getEnterButton()){
           try{
                int value = Integer.parseInt(panel.getNumField().getText());
                panel.getBinaryCalc().enter(value); 
				panel.getDisplay().setText(m + "Decimal = " + value + " Binary = " + panel.getBinaryCalc().getResult());
				panel.getNumField().setText(""); 
            } catch (NumberFormatException exception){
                panel.getDisplay().setText(m+ panel.getNumField().getText() + " : Invalid number");
                panel.getNumField().setText("");
			}
		}
	}
}
