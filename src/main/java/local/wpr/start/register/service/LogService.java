package local.wpr.start.register.service;

import local.wpr.start.register.model.Log;

import java.util.List;

public interface LogService {
    List<Log> getLogs();
    Log getById(Long logId);
}
