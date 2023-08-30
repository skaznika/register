package local.wpr.start.register.config;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
@Slf4j
@EnableWebMvc
public class WebMvcConfiguration extends WebSecurityConfigurerAdapter {
    private static final Logger logger = LoggerFactory.getLogger(WebMvcConfiguration.class);
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login");
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
    }
}
