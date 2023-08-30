package local.wpr.start.register.service;

import local.wpr.start.register.model.Console;

import java.util.List;

public interface ConsoleService {
    List<Console> getAll();
    Console getById(Long consoleId);
//    Console getByProfileName(String profileName);

}
