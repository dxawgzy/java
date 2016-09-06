package book;  // P18
import java.net.*;
import java.io.*;
import java.util.*;

public class ChatServer {
	public static void main(String args[]) {
		ServerSocket socket = null;
		//Vector m_threads = new Vector();
		Vector<ServerThread> m_threads = new Vector<ServerThread>();
		System.out.println("Listen...");
		try {
			socket = new ServerSocket(5555);
		}
		catch(Exception e) {
			System.out.println("new ServerSocket()failed! ");
			return;
		}
		try {
			int nid = 0;
			while(true) {
				Socket s = socket.accept();
				System.out.println("accepted");
				ServerThread st = new ServerThread(s, m_threads);
				st.setID(nid++);
				m_threads.addElement(st);
				new Thread(st).start();
				for(int i = 0; i < m_threads.size(); i++) {
					ServerThread stl = (ServerThread)m_threads.elementAt(i);
					stl.write("<#>welcome "+st.getID()+" to enter chatroom!");
				}
				System.out.println("Listen again...");
			}
		}
		catch(Exception e) {
			System.out.println("Server is down...");
		}
		
	}

}

class ServerThread implements Runnable {
	Vector m_threads;
	Socket m_socket = null;
	DataInputStream m_in = null;
	DataOutputStream m_out = null;
	int m_nid;
	
	public ServerThread(Socket s, Vector threads) {
		m_socket = s;
		m_threads = threads;
		try {
			m_in = new DataInputStream(m_socket.getInputStream());
			m_out = new DataOutputStream(m_socket.getOutputStream());
		}
		catch(Exception e) {}
	}
	
	public void run() {
		System.out.println("thread is running");
		try {
			while(true) {
				String s = m_in.readUTF();
				if(s == null) break;
				if(s.trim().equals("leave")) {
					for(int i = 0; i<m_threads.size();i++) {
						ServerThread st = (ServerThread)m_threads.elementAt(i);
						st.write("***"+ getID()+ " leave..."+"***");
					}
				}
				else {
					for(int i = 0;i<m_threads.size();i++) {
						ServerThread st = (ServerThread)m_threads.elementAt(i);
						st.write("<"+getID()+">"+s);
					}
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		m_threads.removeElement(this);
		try {
			m_socket.close();
		}
		catch(Exception e){}
	}
	
	public void write(String msg) {
		synchronized(m_out) {
			try {
				m_out.writeUTF(msg);
			}
			catch(IOException e) {}
		}
	}
	
	public int getID() {
		return m_nid;
	}
	
	public void setID(int nid) {
		m_nid = nid;
	}
	
}



