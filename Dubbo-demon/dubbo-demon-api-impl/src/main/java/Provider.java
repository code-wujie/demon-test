import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by WJ on 2018/6/8.
 */
public class Provider {
    public static void main(String[] args) throws Exception {
        //Prevent to get IPV6 address,this way only work in debug mode
        //But you can pass use -Djava.net.preferIPv4Stack=true,then it work well whether in debug mode or not
        System.setProperty("java.net.preferIPv4Stack", "true");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"*.xml"});
        context.start();
        System.out.println("程序已经在zookeeper上面发布成功了");
        System.in.read(); // press any key to exit
    }
}
