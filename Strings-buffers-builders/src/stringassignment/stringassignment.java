package stringassignment;

public class stringassignment {

	public static void main(String[] args) {
		String str ="Hello World";
		int i =str.length();//question1
        System.out.println(i);
        String str1 ="Hello,";
        String str2 = "How are you?";
        String con= str1.concat(str2);//question2
        System.out.println(con);
        String str3 ="Java String pool refers to collection of Strings which are stored in heap \r\n"
        		+ "memory";
        String low = str3.toLowerCase();//question3(a)
        System.out.println(low);
        String upp = str3.toUpperCase();//question3(b)
        System.out.println(upp);
        String rep = str3.replace("a","$");//question3(c)
        System.out.println(rep);
        boolean conta = str3.contains("collection");//question3(d)
        System.out.println(conta);
        String str4 ="java string pool refers to collection of strings which are stored in heap memory";
        boolean checkwithoriginal = str3.equals(str4);//question3(e)
        System.out.println(checkwithoriginal);
        boolean checkequ = str3.equalsIgnoreCase(str4);//question3(f)
        System.out.println(checkequ);
        //StringBuffers
        StringBuffer sb = new StringBuffer("StringBuffer");
        sb.append(" is a peer class of String");//No1qn
        sb.append(" that provides much of");
        sb.append(" the functionality of strings");
        System.out.println(sb);
        int len =sb.length();
        System.out.println(len);
        sb.insert(89, ".Insert text it is used to _ at the specified index position. The location denoted by the sign _");
        System.out.println(sb);
        StringBuffer sb1 = new StringBuffer(" This method returns the reversed object on which it was called");
        sb1.reverse();
        System.out.println(sb1);
        //StringBuilders
        StringBuilder sbu = new StringBuilder("StringBuilder");
        sbu.append(" is a peer class of String");//No1qn
        sbu.append(" that provides much of");
        sbu.append(" the functionality of strings");
        System.out.println(sbu);
        int leng =sbu.length();
        System.out.println(leng);
        sbu.insert(89, ".Insert text it is used to _ at the specified index position. The location denoted by the sign _");
        System.out.println(sbu);
        StringBuffer sbu1 = new StringBuffer(" This method returns the reversed object on which it was called");
        sbu1.reverse();
        System.out.println(sbu1);
        
	}

}
