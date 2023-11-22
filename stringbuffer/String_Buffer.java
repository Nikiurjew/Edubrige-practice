package stringbuffer;

public class String_Buffer {

	public static void main(String[] args) {
		StringBuffer str=new StringBuffer("Java");
		//StringBuffer str1=new StringBuffer("Full Stack");
		str.append("Full Stack");
		System.out.println(str);
		
		String sb = new String("Java");
		String sb1 = new String("JaVa");
		boolean sb2 = sb==sb1;
		System.out.println(sb2);
		
		boolean rs=sb.equalsIgnoreCase(sb1);
		System.out.println(rs);
		
		String sb4 = new String("Java");
		String sb5 = new String("JAVA");
		boolean rs1=sb4.equalsIgnoreCase(sb5);
		System.out.println(rs1);
		
		
		StringBuffer strb=new StringBuffer("Java ");
		System.out.println(strb.insert(3,"F"));
		
		
		StringBuffer strb1=new StringBuffer("Java");
		System.out.println(strb1.delete(3,4));
		
		StringBuffer strb2=new StringBuffer("Java");
		System.out.println(strb2.reverse());
		
		StringBuffer strb3=new StringBuffer("Java ");
		System.out.println(strb3.capacity());

	}

}
