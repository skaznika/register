package local.wpr.start.register.service.impl;

import local.wpr.start.register.model.Log;
import local.wpr.start.register.repository.LogRepository;
import local.wpr.start.register.service.LogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogServiceImpl implements LogService {
    private static final Logger logger = LoggerFactory.getLogger(LogServiceImpl.class);

    @Autowired
    private LogRepository logRepository;

    public LogServiceImpl(LogRepository logRepository) {
        this.logRepository = logRepository;
    }

    @Override
    public List<Log> getLogs() {
        return logRepository.findAll();
    }

    @Override
    public Log getById(Long logId) {
        return logRepository.getReferenceById(logId);
    }
}
