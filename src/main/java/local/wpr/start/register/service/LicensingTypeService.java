package local.wpr.start.register.service;

import local.wpr.start.register.model.LicensingType;

import java.util.List;

public interface LicensingTypeService {
    List<LicensingType> getAll();

    LicensingType getById(Long id);
}
