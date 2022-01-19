package boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import boot.bean.Pet;
import boot.bean.User;
import boot.config.MyConfig;
import ch.qos.logback.classic.boolex.OnErrorEvaluator;

/**
 * 主程序类
 * @SpringBootApplication ： 这是一个SpringBoot应用
 */
@SpringBootApplication(scanBasePackages = {"boot2", "boot"})
public class MyApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MyApplication.class, args);

        // 打印所有组件
        // 说明已经配置好了常见的场景
//        String[] names = run.getBeanDefinitionNames();
//        for (String name : names) {
//            System.out.println(name);
//        }
//
//
//        // 从容器中获取组件
//        Pet tom01 = run.getBean("tom", Pet.class);
//        Pet tom02 = run.getBean("tom", Pet.class);
//
//        System.out.println(tom01 == tom02);// true
//
//        // 配置类本身也是组件
//        MyConfig bean = run.getBean(MyConfig.class);
//        System.out.println(bean);
//
//        // 查看调用的是容器中的这个配置类还是单纯的调用这个方法
//        User user01 = bean.user01();
//        User user = bean.user01();
//        System.out.println(user == user01);// true， 单示例对象
//
//        // 调试full和lite
//        User user011 = run.getBean("user01", User.class);
//        System.out.println(user011.getPet() == run.getBean("tom", Pet.class));
//
//        // 调试Import
//        System.out.println("+++++++");
//        String[] namesForType = run.getBeanNamesForType(User.class);
//        for (String s : namesForType) {
//            System.out.println(s);
//        }
//        OnErrorEvaluator bean1 = run.getBean(OnErrorEvaluator.class);
//        System.out.println(bean1);

        // 调试条件装配，注意顺序问题
        System.out.println("+++++++");
        boolean tom = run.containsBean("tom");
        System.out.println(tom);
        boolean user01 = run.containsBean("user01");
        System.out.println(user01);
        boolean user = run.containsBean("boot.bean.User");
        System.out.println(user);
        boolean book = run.containsBean("book");
        System.out.println(book);

        // ImportResource调试
        boolean haha = run.containsBean("haha");
        boolean hehe = run.containsBean("hehe");
        System.out.println(haha + " " + hehe);
    }

}