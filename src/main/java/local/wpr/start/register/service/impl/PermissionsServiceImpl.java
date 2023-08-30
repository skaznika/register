package local.wpr.start.register.service.impl;

import local.wpr.start.register.model.Permissions;
import local.wpr.start.register.repository.PermissionsRepository;
import local.wpr.start.register.service.PermissionsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionsServiceImpl implements PermissionsService {
    private static final Logger logger = LoggerFactory.getLogger(PermissionsServiceImpl.class);

    @Autowired
    private PermissionsRepository permissionsRepository;

    public PermissionsServiceImpl(PermissionsRepository permissionsRepository) {
        this.permissionsRepository = permissionsRepository;
    }

    @Override
    public List<Permissions> getAllPermissions() {
        return permissionsRepository.findAll();
    }

    @Override
    public Permissions getById(Long permissionId) {
        return permissionsRepository.getReferenceById(permissionId);
    }
}
