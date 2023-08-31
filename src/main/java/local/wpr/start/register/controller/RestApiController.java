package local.wpr.start.register.controller;

import local.wpr.start.register.model.*;
import local.wpr.start.register.service.impl.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/")
public class RestApiController {
    private static final Logger logger = LoggerFactory.getLogger(RestApiController.class);
    @Autowired
    AccessServerRoomServiceImpl accessServerRoomServiceImpl;
    @Autowired
    AccountStatusServiceImpl accountStatusServiceImpl;
    @Autowired
    CardServiceImpl cardServiceImpl;
    @Autowired
    ConsoleServiceImpl consoleServiceImpl;
    @Autowired
    DepartmentServiceImpl departmentServiceImpl;
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
    @Autowired
    AllServiceImpl allServiceImpl;
    @Autowired
    EmployeeViewServiceImpl employeeViewServiceImpl;


    @RequestMapping(path = "/api/employee/v1", method = RequestMethod.GET, produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Employee>> allEmployee() {
        try {
            return new ResponseEntity<List<Employee>>(employeeServiceImpl.getAll(), HttpStatus.OK);
        } catch (Exception e) {
            String error = e.toString();
            logger.error("Błąd exception z API : lokalicazja /api/employee/v1", error);
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(path = "/api/employee/v2", method = RequestMethod.GET, produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<EmployeeView>> allEmployeeView() {
        try {
            return new ResponseEntity<List<EmployeeView>>(employeeViewServiceImpl.getAll(), HttpStatus.OK);
        } catch (Exception e) {
            String error = e.toString();
            logger.error("Błąd exception z API : lokalicazja /api/employee/v2", error);
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }

    @RequestMapping(path = "/api/card/v1", method = RequestMethod.GET, produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Card>> allCard() {
        try {
            return new ResponseEntity<List<Card>>(cardServiceImpl.getAll(), HttpStatus.OK);
        }catch (Exception e) {
            String error = e.toString();
            logger.error("Błąd exception z API : lokalicazja /api/card/v1", error);
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(path = "/api/card/v2", method = RequestMethod.GET, produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Card>> allByCards() {
        try {
            return new ResponseEntity<List<Card>>(cardServiceImpl.getAllCards(), HttpStatus.OK);
        } catch (Exception e) {
            String error = e.toString();
            logger.error("Błąd exception z API : lokalicazja /api/card/v2", error);
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(path = "/api/console/v1", method = RequestMethod.GET, produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Console>> allConsole(){
        try {
            return new ResponseEntity<List<Console>>(consoleServiceImpl.getAll(), HttpStatus.OK);
        } catch (Exception e) {
            String error = e.toString();
            logger.error("Błąd exception z API : lokalicazja /api/console/v1", error);
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(path = "/api/console/v2", method = RequestMethod.GET, produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Console>> allConsoleByNrOstr(){
        try {
            return new ResponseEntity<List<Console>>(consoleServiceImpl.getAllByConsole(), HttpStatus.OK);
        } catch (Exception e) {
            String error = e.toString();
            logger.error("Błąd exception z API : lokalicazja /api/console/v2", error);
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(path = "/api/account_status/v1", method = RequestMethod.GET, produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<AccountStatus>> allStatus() {
        try {
            return new ResponseEntity<List<AccountStatus>>(accountStatusServiceImpl.getAll(), HttpStatus.OK);
        } catch (Exception e) {
            String error = e.toString();
            logger.error("Błąd exception z API : lokalicazja /api/account_status/v1", error);
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(path="/api/department/v1", method = RequestMethod.GET, produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Department>> allDepartments() {
        try {
            return new ResponseEntity<List<Department>>(departmentServiceImpl.getAll(), HttpStatus.OK);
        }catch (Exception e) {
            String error = e.toString();
            logger.error("Błąd exception z API : lokalicazja /api/department/v1", error);
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }

    @RequestMapping(path="/api/user_group/v1", method = RequestMethod.GET, produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Group>> allGroups() {
        try {
            return new ResponseEntity<List<Group>>(groupServiceImpl.getAll(), HttpStatus.OK);
        } catch (Exception e) {
            String error = e.toString();
            logger.error("Błąd exception z API : lokalicazja /api/user_group/v1", error);
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(path = "/api/language/v1", method = RequestMethod.GET, produces =MimeTypeUtils.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Language>> allLanguages(){
        try {
            return new ResponseEntity<List<Language>>(languageServiceImpl.getAll(), HttpStatus.OK);
        }catch (Exception e) {
            String error = e.toString();
            logger.error("Błąd exception z API : lokalicazja /api/language/v1", error);
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(path="/api/position/v1", method = RequestMethod.GET, produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Position>> allPositions(){
        try {
            return new ResponseEntity<List<Position>>(positionServiceImpl.getAllPosition(), HttpStatus.OK);
        } catch (Exception e) {
            String error = e.toString();
            logger.error("Błąd exception z API : lokalicazja /api/position/v1", error);
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(path = "/api/acces_server_room", method = RequestMethod.GET, produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<AccesServerRoom>> allAccesServerRoom(){
        try {
            return new ResponseEntity<List<AccesServerRoom>>(accessServerRoomServiceImpl.getAll(), HttpStatus.OK);
        } catch (Exception e) {
            String error = e.toString();
            logger.error("Błąd exception z API : lokalicazja /api/access_server_room", error);
            System.out.println("Error : " + error);
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(path = "/api/all/v1", method = RequestMethod.GET, produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<All>> getAll(){
        try {
            return new ResponseEntity<List<All>>(allServiceImpl.getAll(), HttpStatus.OK);
        } catch (Exception e) {
            String error = e.toString();
            logger.error("Błąd exception z API : lokalicazja /api/all/v1", error);
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }


}
