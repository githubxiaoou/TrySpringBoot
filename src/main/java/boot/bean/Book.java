package boot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 两步，一步是绑定property，一步是加入容器
 * 或者在MyConfig文件中加上@EnableConfigurationProperties注解
 */
@Component
@ConfigurationProperties(prefix = "mybook")
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private String author;
    private int size;
}
