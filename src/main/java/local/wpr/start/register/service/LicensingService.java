package local.wpr.start.register.service;

import local.wpr.start.register.model.Licensing;

import java.util.List;

public interface LicensingService {
    List<Licensing> getAll();
    Licensing getById(Long licensingId);
}
