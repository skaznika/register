package local.wpr.start.register.service;

import local.wpr.start.register.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAll();
    Employee getById(Long employeeId);
}
