package local.wpr.start.register.service.impl;

import local.wpr.start.register.model.Console;
import local.wpr.start.register.repository.ConsoleRepository;
import local.wpr.start.register.service.ConsoleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsoleServiceImpl implements ConsoleService {
    private static final Logger logger = LoggerFactory.getLogger(ConsoleServiceImpl.class);

    @Autowired
    private ConsoleRepository consoleRepository;

    public ConsoleServiceImpl(ConsoleRepository consoleRepository) {
        this.consoleRepository = consoleRepository;
    }

    @Override
    public List<Console> getAll() {
        return consoleRepository.findAll();
    }

    @Override
    public Console getById(Long consoleId) {
        return consoleRepository.getReferenceById(consoleId);
    }

    public void saveConsole(Console console) {
        consoleRepository.save(console);
    }

    public List<Console> getAllByConsole() {
        return consoleRepository.getAllByOstNr();
    }
//    @Override
//    public Console getByProfileName(String profileName) {
//        return consoleRepository.findOne(profileName);
//    }
}
