package local.wpr.start.register.controller;

import local.wpr.start.register.model.Licensing;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.ldap.userdetails.LdapUserDetailsImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.security.Principal;

@Controller
@RequestMapping("/")
public class LoginController {
    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @GetMapping(value = {"/", "/login"})
    public ModelAndView login(){
        ModelAndView model = new ModelAndView();
        model.setViewName("login");
        return model;
    }

    @GetMapping("/index")
    public String viewHome(HttpSession httpSession, Principal principal, Model model) {
        LdapUserDetailsImpl ldapUserDetails = (LdapUserDetailsImpl) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String dn = ldapUserDetails.getDn();
        int beginIndex = dn.indexOf("cn=") + 3;
        int endIndex = dn.indexOf(",");
        String fullName = dn.substring(beginIndex, endIndex);
        httpSession.setAttribute("test", fullName);
        return "index";
    }
}
