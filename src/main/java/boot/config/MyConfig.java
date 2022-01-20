package boot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

import boot.bean.Pet;
import boot.bean.User;
import ch.qos.logback.classic.boolex.OnErrorEvaluator;

/**
 * 配置类默认是单实例的
 * 最佳实战
 * ■配置类组件之间无依赖关系用Lite模式加速容器启动过程，减少判断
 * ■配置类组件之间有依赖关系，方法会被调用得到之前单实例组件,用Full模式
 *
 * 4、@import({User.class, DBHelper.class})
 */
// 告诉SpringBoot这是一个配置类 == 配置文件
@Import({User.class, OnErrorEvaluator.class})
@Configuration(proxyBeanMethods = true)// 默认true，保持组件单实例。
//@ConditionalOnMissingBean(name = "book")
@ImportResource("classpath:bean.xml")
//@EnableConfigurationProperties(Book.class)
public class MyConfig {

    // 默认的key是方法名，返回值是value
    @Bean
    public User user01() {
        User user = new User("zhangsan", 18);
        user.setPet(tomcatPet());
        return user;
    }


    // 加了注解之后，注解才是方法名
//    @ConditionalOnBean(name = "book")// 注意book需要定义在tom之前
    @Bean("tom")
    public Pet tomcatPet() {
        return new Pet("tomcat");
    }

}
