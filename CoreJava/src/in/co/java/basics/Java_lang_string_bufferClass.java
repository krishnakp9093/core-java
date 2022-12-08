package in.co.java.basics;

public class Java_lang_string_bufferClass {
public static void main(String[] args) {
	StringBuffer sb = new StringBuffer("Rohit");
	sb.append("Singh Patel");
	System.out.println("length:" +sb.length());
	System.out.println("Capacity:" +sb.capacity());
	System.out.println("Reverse:"+sb.reverse());
	System.out.println("Index of :"+sb.indexOf("a"));
}
}
