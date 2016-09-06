package book2;
import java.awt.*;
import java.applet.*;

public class TextField1 extends Applet {
	Button 
	    b1 = new Button("Get Text"),
	    b2 = new Button("Set Text");
	TextField t = new TextField("Starting text", 30);
	String s  = new String();
	
	public void init() {
		add(b1);
		add(b2);
		add(t);
	}
	
	public boolean action (Event evt, Object arg) {
		if(evt.target.equals(b1)) {
			getAppletContext().showStatus(t.getText());
			s = t.getSelectedText();
			if(s.length() == 0) s = t.getText();
			t.setEditable(true);
		}
		else if(evt.target.equals(b2)) {
			t.setText("Inserted by button 2:" + s);
			t.setEditable(false);
		}
		else
			return super.action(evt, arg);
		return true;
	}

}




