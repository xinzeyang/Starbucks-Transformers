package springbootfinalproject;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class UserApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(UserApplication.class,args);
	}

//	@Bean
//	public DataSource dataSource() {
//	return DataSourceBuilder.create().build();
//	}
}

