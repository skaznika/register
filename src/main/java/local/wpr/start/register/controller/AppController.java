package local.wpr.start.register.controller;

import local.wpr.start.register.model.*;
import local.wpr.start.register.repository.AllRepository;
import local.wpr.start.register.repository.RoleRepository;
import local.wpr.start.register.repository.UserRepository;
import local.wpr.start.register.service.impl.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;



@Controller
@CrossOrigin
public class AppController {
    private static final Logger logger = LoggerFactory.getLogger(AppController.class);
    @Autowired
    AccessServerRoomServiceImpl accessServerRoomServiceImpl;
    @Autowired
    AccountStatusServiceImpl accountStatusServiceImpl;
    @Autowired
    CardServiceImpl cardServiceImpl;
    @Autowired
    ConsoleServiceImpl consoleServiceImpl;
    @Autowired
    EmployeeServiceImpl employeeServiceImpl;
    @Autowired
    GroupServiceImpl groupServiceImpl;
    @Autowired
    LanguageServiceImpl languageServiceImpl;
    @Autowired
    LicensingServiceImpl licensingServiceImpl;
    @Autowired
    LogServiceImpl logServiceImpl;
    @Autowired
    PermissionsServiceImpl permissionsServiceImpl;
    @Autowired
    PositionServiceImpl positionServiceImpl;
//    @Autowired
//    FileUploaderServiceImpl fileService;
//    @Autowired
//    AllDataServiceImpl excelService;
    @Autowired
    AllRepository repo;

    @Autowired
    UserRepository userRepository;
    @Autowired
    RoleRepository roleRepository;

    @GetMapping("/card")
    public String card(Card card){
        return "/card";
    }

    @GetMapping("/console")
    public String console(Console console){
        return "/console";
    }

    @GetMapping("/employee")
    public String employee(AccountStatus accountStatus, Department department, Language language, Employee employee){ return "/employee";}

    @PostMapping("/managment/add_employee")
    public String addEmployee(Employee employee, Department department, Language language){
//        Long id = employeeServiceImpl.getLastId().getEmployeeId();
//        System.out.println("Ostatnie ID: " + id);
//        Long a = null;
//        a = id + 1;
//        System.out.println("A wynosi : " + a);
//        Employee emp = new Employee();
//        emp.setEmployeeId(a);
//        emp.setFName(employee.getFName());
//        emp.setLName(employee.getLName());
//        emp.setDepartment(employee.setDepartment(department.getDepartmentId()).getDepartmentId());
//        employeeServiceImpl.saveEmployee(emp);
        return "redirect: /employee";
    }

    @GetMapping("/managment/account_status")
    public String managerStatus() {
        return "/managment/account_status";
    }

    @GetMapping("/managment/department")
    public String department() {
        return "/managment/department";
    }

//    @GetMapping("/managment/employee_language")
//    public String employeeLanguage() {
//        return "/managment/employee_language";
//    }

    @GetMapping("/managment/user_group")
    public String userGroup() {
        return "/managment/user_group";
    }

    @GetMapping("/managment/user_permissions")
    public String userPermissions() {
        return "/managment/user_permissions";
    }

    @GetMapping("/managment/language")
    public String languages() { return "/managment/language"; }

    @GetMapping("/managment/position")
    public String position() { return "/managment/position";}

    @GetMapping("/admin/new")
    public ModelAndView newUser() {
    User user = new User();
    ModelAndView mav = new ModelAndView("/admin/new");
    mav.addObject("user", user);
        List<Role> roles = (List<Role>) roleRepository.findAll();
        mav.addObject("allRoles", roles);
        return mav;
    }

    @GetMapping("/admin/users/edit/{id}")
    public ModelAndView editUser(@PathVariable(name = "userId") Integer userId){
        User user = userRepository.getReferenceById(Long.valueOf(userId));
        ModelAndView mav = new ModelAndView("admin/new");
        mav.addObject("user", user);
        List<Role> roles = (List<Role>) roleRepository.findAll();
        mav.addObject("allRoles", roles);
        return mav;
    }

    @GetMapping("/admin/uploadPage")
    public String uploadPage(){
        return "admin/uploadPage";
    }

//    @PostMapping("/uploadFile")
//    public String uploadFile(@RequestParam("file")MultipartFile file, RedirectAttributes redirectAttributes) {
//       fileService.uploadFile(file);
////       redirectAttributes.getFlashAttributes("message",
////               "Pomyślnie wgrano plik '" + file.getOriginalFilename()+"' !");
//       try {
//           Thread.sleep(3000);
//       } catch (InterruptedException e) {
//           e.printStackTrace();
//       }
//       return "redirect:/admin/uploadPage";
//    }

}
