package example.myboard.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {"example.myboard.dao", "example.myboard.service"})
@Import(DBConfig.class)
public class ApplicationConfig {
}
