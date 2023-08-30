package local.wpr.start.register.utils;

import local.wpr.start.register.model.Role;
import local.wpr.start.register.model.User;
import local.wpr.start.register.repository.RoleRepository;
import local.wpr.start.register.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ldap.core.DirContextOperations;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.ldap.userdetails.LdapAuthoritiesPopulator;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Slf4j
@Service
public class MyAuthoritiesPopulator implements LdapAuthoritiesPopulator {
    private static final Logger logger = LoggerFactory.getLogger(MyAuthoritiesPopulator.class);
    @Autowired
    RoleRepository roleRepository;
    @Autowired
    UserRepository userRepository;

    public MyAuthoritiesPopulator(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Collection<? extends GrantedAuthority> getGrantedAuthorities(DirContextOperations userData, String userName) {
        Set<GrantedAuthority> authorities = new HashSet<>();
        try {
            User user = userRepository.findByUserName(userName);
            System.out.println("USER : " + user.getUserFullName());
            if (user == null) {
                System.out.println("USERA NIE MA W BAZIE");
                authorities.isEmpty();
//                authorities.add(new SimpleGrantedAuthority("USER"));
            } else {
                System.out.println("USER JEST W BAZIE " + userName);
                Role role = roleRepository.findByUsername(userName);
                System.out.println(role);
                authorities.add(new SimpleGrantedAuthority(role.getRoleName()));
            }
        } catch (Exception e) {
          logger.error(e.getMessage(), e);
        }
//        System.out.println("AUTH : " + authorities);
        return authorities;
    }
}
