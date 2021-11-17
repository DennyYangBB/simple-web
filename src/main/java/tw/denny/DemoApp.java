package tw.denny;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author: Denny Yang
 * @since: 2021/11/4
 */
@SpringBootApplication
public class DemoApp extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(DemoApp.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApp.class, args);
    }
}
