import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.PARAMETER, ElementType.METHOD})

@interface Info{
	int AuthorID();
	String Author() default "Mukthesh";
	String Supervisor() default "Vicky";
	String Date();
	String Time();
	int version();
	String description() default "Displaying Method";
}

class Devloper{
	@Info(AuthorID = 1937, Date = "28-11-1999", Time = "10:42pm", version = 4)
	public void displayMethod(){
		System.out.println("Author Info");
		}
}
public class AnnotationQ2 {
	public static void main(String[] args)throws Exception{
		Devloper devloper = new Devloper();
		
		Method m = devloper.getClass().getMethod("displayMethod");

		Info d1 = m.getAnnotation(Info.class);
		
		System.out.println("Author ID is: "+d1.AuthorID());
		System.out.println("Author Name is: "+d1.Author());
		System.out.println("Supervisor is: "+d1.Supervisor());
		System.out.println("Date is: "+d1.Date());
		System.out.println("Time is: "+d1.Time());
		System.out.println("version is: "+d1.version());

	}

}
