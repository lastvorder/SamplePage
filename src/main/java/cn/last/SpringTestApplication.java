package cn.last;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author chenzihao
 */
@SpringBootApplication
@MapperScan("cn.last.mapper")
public class SpringTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringTestApplication.class, args);
    }
}
