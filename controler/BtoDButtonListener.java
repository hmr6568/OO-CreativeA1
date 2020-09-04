package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import screen.BinaryToDecimal;
import screen.MenuScreen;

public class BtoDButtonListener implements ActionListener{
	private BinaryToDecimal panel;

    public BtoDButtonListener(BinaryToDecimal panel){
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
                String value = panel.getNumField().getText();
                panel.getBtoDCalc().enter(value); 
				panel.getDisplay().setText(m + "Binary = " + value + " Decimal = " + panel.getBtoDCalc().getResult());
				panel.getNumField().setText(""); 
            } catch (NumberFormatException exception){
                panel.getDisplay().setText(m+ panel.getNumField().getText() + " : Invalid number");
                panel.getNumField().setText("");
			}
		}
	}
}
