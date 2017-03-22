import java.io.StringWriter;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.VelocityContext;

public class HelloWorld
  {
 	public static void main(String args[])
 	throws Exception
 	{
 		Velocity.init();

 		VelocityContext context = new VelocityContext();
 		context.put("name", "World");

 		String s = "Hello $name!";
 		StringWriter w = new StringWriter();

 		Velocity.evaluate(context, w, "hello", s);

 		System.out.println(w);
 	}
 }