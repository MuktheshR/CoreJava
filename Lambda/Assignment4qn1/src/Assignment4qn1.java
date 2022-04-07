public class Assignment4qn1 {
	public static void main(String[] args) {
	functional Function = ( num1, num2)-> (num1+num2);
	functional Function1 = ( num1,num2)-> (num1-num2);
	functional Function2 = ( num1, num2)-> (num1*num2);
	functional Function3 = ( num1, num2)-> (num1/num2);
	System.out.println(Function.myfun(13,5));
	System.out.println(Function1.myfun(13,5));
	System.out.println(Function2.myfun(13,5));
	System.out.println(Function3.myfun(13,5));

	}
 

	interface functional{
		double myfun(double num1,double num2 );
	}
//	private int function (int num1,int num2,functional Functional) {
//		return Functional.myfun(num1, num2);
//	}
//    public static void main(String[] args) {
//  		Assignment4qn1 obj = new Assignment4qn1();
//    	functional addit = (num1,num2)->(num1+num2);
//    	functional sub = (num1,num2)->(num1-num2);
//    	functional mul = (num1,num2)->(num1*num2);
//    	functional div = (num1,num2)->(num1/num2);
//    	
//    	System.out.println(obj.function(13, 5,addit));
//    	System.out.println(obj.function(13, 5,sub));
//    	System.out.println(obj.function(13, 5,mul));
//    	System.out.println(obj.function(13, 5,div));
//
//    }



}
