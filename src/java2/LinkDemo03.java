package java2;

class Node{
	private String data;  //类中的属性必须封装，即 private
	private Node next;    //LinkDemo02中使用了内部类，故不需getter和setter方法
	
	public Node(String data){  //构造方法
		//this.setData(data);
		this.data = data;
	}
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	public void add(Node newNode){
		if(this.getNext() == null){
			this.setNext(newNode);
		}else{
		    this.getNext().add(newNode);
		}
	}
	public void print(){
		System.out.print(this.getData() + "\t");
		if(this.getNext() != null){
			this.getNext().print();
		}
	}
	public boolean search(String data){
		if(data.equals(this.getData())){
			return true;
		}else{
			if(this.getNext() != null){
				return this.getNext().search(data);
			}else {
				return false;
			}
		}
	}
	public void delete(Node previous, String data){
		if(data.equals(this.getData())){
			previous.setNext(this.getNext());
		}else{
			if(this.getNext() != null){
				this.getNext().delete(this, data);
			}
		}
	}
	
}


class Link03{
	private Node root;
	public void addNode(String data){
		Node newNode = new Node(data);
		if(this.root == null){
			this.root = newNode;
		}else{
			this.root.add(newNode);
		}
	}
	public void printNode(){
		if(this.root != null){
			this.root.print();
		}
	}
	public boolean contains(String name){
		return this.root.search(name);
	}
	public void deleteNode(String data){
		if(this.contains(data)){
			if(this.root.getData().equals(data)){
				this.root = this.root.getNext();
			}else{
				this.root.getNext().delete(root, data);
			}
		}
	}
}


public class LinkDemo03 {
	public static void main(String[] args){
		Link03 lin = new Link03();
		lin.addNode("A");
		lin.addNode("B");
		lin.addNode("C");
		lin.addNode("D");
		lin.addNode("E");
		System.out.println("======= 删除之前 ========");
		lin.printNode();
		System.out.println("\n======= 删除之后 ========");
		lin.deleteNode("C");
		lin.printNode();
		System.out.println("\n包含节点B ：" + lin.contains("B"));
	}

}


