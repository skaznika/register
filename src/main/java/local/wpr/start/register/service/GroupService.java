package local.wpr.start.register.service;

import local.wpr.start.register.model.Group;

import java.util.List;

public interface GroupService {
    List<Group> getAll();
    Group getById(Long id);
}
