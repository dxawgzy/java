package book;  //P5 使用URL来获取文本文件和图像文件

import java.net.*;
import java.io.*;
import java.awt.*;

public class GetDataByURL extends Frame {
	MenuBar menuBar;
	boolean drawImage = false;
	//DataInputStream dataInputStream;
	int i = 0;
	String line_str;
	boolean first=true;
	Font font;
	
	public GetDataByURL() {
		menuBar = new MenuBar();
		setMenuBar(menuBar);
		Menu display = new Menu("display");
		menuBar.add(display);
		MenuItem beauty_display = new MenuItem("display beauty");
		MenuItem text_display = new MenuItem("display text");
		display.add(beauty_display);
		display.add(text_display);
		setBackground(Color.white);
		font = new Font("System", Font.BOLD, 20);
		setTitle("sample: use URL get data");
		setSize(400, 300);
		//show();
		setVisible(true);
	}
	
	public boolean action(Event evt, Object what){
		if(evt.target instanceof MenuItem) {
			String message = (String)what;
			if (message == "display beauty") {
				drawImage = true;
				doDrawImage();
			}
			else {
				drawImage = false;
				first = true;
				if (message == "display text") {
					doWrite("file:///e://workspace/ziyuan//git.txt");
				}
			}
		}
		return true;
	}
	
	public boolean handleEvent(Event evt) {
		switch(evt.id) {
		case Event.WINDOW_DESTROY: dispose();
			System.exit(0);
		default:
			return super.handleEvent(evt);
		}
	}
	
	public static void main(String args[]) {
		new GetDataByURL();
	}
	
	public void paint(Graphics g) {
		if (drawImage) {
			try {
				URL image_URL = new URL("file:///e://workspace/ziyuan//1492823672.jpg");
				Toolkit object_Toolkit = Toolkit.getDefaultToolkit();
				Image object_Image = object_Toolkit.getImage(image_URL);
				g.setColor(Color.white);
				g.fillRect(0,0,400,300);
				g.drawImage(object_Image,40,80,160,200,this);
			}
			catch (MalformedURLException e) {}
		}
		else {
			if (first) {
				first = false;
				g.setColor(Color.white);
				g.fillRect(0,0,400,300);
				g.setFont(font);
			}
			if (line_str != null) {
				g.drawString(line_str,10,i*20);
			}
			i++;
		}
	}
	
	private void doDrawImage() {
		drawImage = true;
		repaint();
	}
	
	private void doWrite(String url_str) {
		try {
			URL url = new URL(url_str);
			//dataInputStream = new DataInputStream(url.openStream());
			BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
			try {
				i = 1;
			    //line_str = dataInputStream.readLine();
				line_str = in.readLine();
				while(line_str != null) {
					paint(getGraphics());
					//line_str = dataInputStream.readLine();
					line_str = in.readLine();
				}
			}
			catch(IOException e){}
			//dataInputStream.close();
			in.close();
		}
		catch(MalformedURLException e1) {}
		catch(IOException e2) {}
	}

}



