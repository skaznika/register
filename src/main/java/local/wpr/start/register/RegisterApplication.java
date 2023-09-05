package local.wpr.start.register;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

import java.util.logging.LogManager;

@PropertySource("classpath:db.properties")
@SpringBootApplication
public class RegisterApplication {
	private static final Logger logger = LoggerFactory.getLogger(RegisterApplication.class);
	public static void main(String[] args)
	{
		logger.info("z klasy głównej");
		logger.info("wydruk na konsoli");
		logger.debug("Debugowanie działa");
		logger.warn("Ostrzeżenie działa");
		SpringApplication.run(RegisterApplication.class, args);
	}

}
