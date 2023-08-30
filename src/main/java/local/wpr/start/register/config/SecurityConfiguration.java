package local.wpr.start.register.config;

import local.wpr.start.register.controller.MyErrorController;
import local.wpr.start.register.repository.UserRepository;
import local.wpr.start.register.utils.CustomAccessDeniedHandler;
import local.wpr.start.register.utils.MyAuthoritiesPopulator;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.ldap.LdapProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.ldap.core.support.LdapContextSource;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.web.access.AccessDeniedHandler;

@Slf4j
@Configuration
@EnableAutoConfiguration
@EnableWebSecurity
@ComponentScan({"local.wpr.start"})
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    private static final Logger logger = LoggerFactory.getLogger(SecurityConfiguration.class);

    private UserRepository userRepository;
    private LdapProperties ldapProperties;
    private LdapContextSource ldapContextSource;
    @Autowired
    private MyAuthoritiesPopulator myAuthoritiesPopulator;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/resource/**").permitAll()
                .antMatchers("/login").permitAll()
                .antMatchers("/").permitAll()
                .anyRequest()
                .fullyAuthenticated()
                .and()
                .formLogin()
//                .usernameParameter("user_name")
//                .passwordParameter("password")
                .defaultSuccessUrl("/index", true)
                .failureUrl("/login?error=true")
//                .and()
//                .exceptionHandling()
//                .authenticationEntryPoint(new MyErrorController())
                .and()
                .exceptionHandling()
                .accessDeniedHandler(new CustomAccessDeniedHandler())
                .and()
                .logout()
                .logoutUrl("/logout")
                .logoutSuccessUrl("/")
                .clearAuthentication(true)
                .permitAll()
                .and()
                .csrf()
                .disable();
    }

    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .ldapAuthentication()
                .userSearchBase("DC=wpr,DC=local")
                .userSearchFilter("(&(objectClass=user)(sAMAccountName={0}))")
                .ldapAuthoritiesPopulator(myAuthoritiesPopulator)
                .contextSource()
                .url("ldap://10.20.112.221:389")
                .managerDn("ldap@wpr.local")
                .managerPassword("L!D@A#P$4linux");
    }

    @Bean
    @Override
    protected UserDetailsService userDetailsService() {
        return super.userDetailsService();
    }

//    @Bean
//    public AccessDeniedHandler accessDeniedHandler() {
//        return new CustomAccessDeniedHandler();
//    }

    @Override
    public void configure(WebSecurity web) {
        web
                .ignoring()
                .antMatchers("/resources/**", "/static/**", "/css/**", "/js/**", "/templates/**", "/images/**","/icon/**", "/reports/**","/video/**");
    }

    UserDetailsService userDetailsService = new UserDetailsService() {
        @Override
        public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
            return userDetailsService.loadUserByUsername("sAMAccountName={0}");
        }
    };
}
