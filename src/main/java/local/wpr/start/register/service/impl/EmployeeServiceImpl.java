package local.wpr.start.register.service.impl;

import local.wpr.start.register.model.Employee;
import local.wpr.start.register.repository.EmployeeRepository;
import local.wpr.start.register.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private static final Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);
    @Autowired
    EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getById(Long employeeId) {
        return employeeRepository.getReferenceById(employeeId);
    }

    public Employee getLastId(){return employeeRepository.getLastId();}

    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }
}
