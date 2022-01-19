package boot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 两步，一步是绑定property，一步是加入容器
 * 或者在MyConfig文件中加上@EnableConfigurationProperties注解
 */
@Component
@ConfigurationProperties(prefix = "mybook")
public class Book {
    private String author;
    private int size;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
