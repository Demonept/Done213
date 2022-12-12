import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanS =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat catFir = (Cat) applicationContext.getBean("cat");
        System.out.println(catFir.getVoice());
        Cat catSec = (Cat) applicationContext.getBean("cat");
        System.out.println(catFir==catSec);
        System.out.println(bean==beanS);

        System.out.println(bean.getMessage());
    }
}