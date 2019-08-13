import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class DubboStartTest {
   public static void main(String[] args) throws IOException {
       ApplicationContext context = new ClassPathXmlApplicationContext("/dubbo-provider.xml");
       ((ClassPathXmlApplicationContext) context).start();
       System.in.read();
   }
}
