class Rectangle5 extends Shape5 {
    @Override
    public String draw() {
    	System.out.println("[]");
		return null;
    }
}

class Line5 extends Shape5{
    @Override
    public String draw() {
    	System.out.println("_______");
		return null;
    }
}

class Cube5 extends Shape5 {
    @Override
    public String draw() {
    	System.out.println("cube Created");
		return null;
    }
}
abstract class Shape5 {
    abstract public String draw();
}

public class Assignment2Q5 {

	public static void main(String[] args) {
		Rectangle5 obj =new Rectangle5();
		obj.draw();
		Line5 obj1 =new Line5();
		obj1.draw();
		Cube5  obj2 =new Cube5();
		obj2.draw();
		
	}

}