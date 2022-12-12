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
        System.out.println(bean.getMessage());
        System.out.println(catFir.getVoice());
        Cat catSec = (Cat) applicationContext.getBean("cat");
        System.out.println("Ссылки на объекты котов равны? " + (catFir==catSec));
        System.out.println("Ссылки на объекты приветмиров равны? " + (bean==beanS));


    }
}