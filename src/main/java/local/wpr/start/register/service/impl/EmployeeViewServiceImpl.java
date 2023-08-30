package local.wpr.start.register.service.impl;

import local.wpr.start.register.model.EmployeeView;
import local.wpr.start.register.repository.EmployeeViewRepository;
import local.wpr.start.register.service.EmployeeViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeViewServiceImpl implements EmployeeViewService {
    @Autowired
    EmployeeViewRepository employeeViewRepository;

    public EmployeeViewServiceImpl(EmployeeViewRepository employeeViewRepository) {
        this.employeeViewRepository = employeeViewRepository;
    }

    @Override
    public List<EmployeeView> getAll() {
        return employeeViewRepository.findAll();
    }
}
