package local.wpr.start.register.service;

import local.wpr.start.register.model.Permissions;

import java.util.List;

public interface PermissionsService {

    List<Permissions> getAllPermissions();
    Permissions getById(Long permissionId);
}
