package example;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 不触发自动扫描，不加载多余实例，加快启动速度
@Configuration
@EnableAutoConfiguration
public class DemoApplication {
    // 用 @Bean 注解明确显式配置，以便被 Spring 扫描到
    @Bean
    public HelloController messageController() {
        return new HelloController();
    }
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
*/
@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}