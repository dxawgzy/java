package book2;

import java.awt.*;
import java.applet.*;

public class Button2 extends Applet {
	Button
	    b1 = new Button("Button 1"),
		b2 = new Button("Button 2");
	public void init() {
		add(b1);
		add(b2);
	}
	
	public boolean action(Event evt, Object arg) {
		if(evt.target.equals(b1))
			getAppletContext().showStatus("Button 1 test");
		else if(evt.target.equals(b2))
			getAppletContext().showStatus("Button 2 true");
		else
			return super.action(evt, arg);
		return true;
	}

}


/*
@Deprecated
public boolean action(Event evt, Object what)Deprecated. 
As of JDK version 1.1, should register this component as ActionListener 
on component which fires action events.

*/



