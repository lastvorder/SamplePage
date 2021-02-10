package cn.last.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author chenzihao
 */
@Configuration
@MapperScan("cn.last.mapper")
public class MyBatisConfig {
}
