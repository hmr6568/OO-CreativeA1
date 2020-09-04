package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import screen.DecimalToHex;
import screen.MenuScreen;

public class DtoHButtonListener implements ActionListener{
	private DecimalToHex panel;

    public DtoHButtonListener(DecimalToHex panel){
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
                panel.getDtoHCalc().enter(value); 
				panel.getDisplay().setText(m + "Decimal = " + value + " Hexadecimal = " + panel.getDtoHCalc().getResult());
				panel.getNumField().setText(""); 
            } catch (NumberFormatException exception){
                panel.getDisplay().setText(m+ panel.getNumField().getText() + " : Invalid number");
                panel.getNumField().setText("");
			}
		}
	}
}
