package local.wpr.start.register.service.impl;

import local.wpr.start.register.model.All;
import local.wpr.start.register.repository.AllRepository;
import local.wpr.start.register.service.AllService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AllServiceImpl implements AllService {
    @Autowired
    AllRepository allRepository;

    public AllServiceImpl(AllRepository allRepository) {
        this.allRepository = allRepository;
    }

    @Override
    public List<All> getAll() {
        return allRepository.findAll();
    }
}
