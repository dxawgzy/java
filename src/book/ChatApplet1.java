package book;  // P22
import java.awt.*;
import java.applet.*;
import java.io.*;
import java.net.*;

public class ChatApplet1 extends Applet implements Runnable {
	TextArea m_textarea;
	TextField m_textfield;
	DataInputStream m_in;
	DataOutputStream m_out;
	
	public void init() {
		setLayout(null);
		setSize(426,266);
		m_textarea = new TextArea(10, 10);
		m_textfield = new TextField();
		m_in = null;
		m_out = null;
		try {
			URL url = getCodeBase();  //返回当前文件的路径:确切的说是class文件的路径
			InetAddress inetaddr = InetAddress.getByName(url.getHost());
			Socket m_socket;
			System.out.println("Server:"+ inetaddr+""+url.getHost()+""+url.getProtocol());
			m_socket = new Socket(inetaddr,5555);
			
			//Socket m_socket = new Socket("10.89.151.85",5555);
			
			m_in = new DataInputStream(m_socket.getInputStream());
			m_out = new DataOutputStream(m_socket.getOutputStream());
		}
		catch(Exception e) {
			System.out.println("Error:" +e);
		}
		setLayout(new BorderLayout());
		add("Center", m_textarea);
		add("South", m_textfield);
		m_textarea.setEditable(false);
		new Thread(this).start();
	}
	
	public boolean handleEvent(Event event) {
	//protected void processEvent(AWTEvent event) {
		String b = m_textfield.getText();
		if((event.target == m_textfield) && (event.id == Event.ACTION_EVENT)) {
			m_textfield.setText("");
			try {
				m_out.writeUTF(b);
			}
			catch(IOException e) {}
			return true;
		}
		else
			//return super.handleEvent(event);
			return super.handleEvent(event);
	}
	
	public void run() {
		try {
			while(true) {
				String s = m_in.readUTF();
				if(s!=null) {
					m_textarea.append(s+"\n");
				}
			}
		}
		catch(Exception e) {
			m_textarea.append("Network problem or Server down.\n");
			m_textfield.setVisible(false);
			
		}
			
	}
	
	public void stop() {
		try {
			m_out.writeUTF("leave");
		}
		catch(IOException e) {}
	}

}



