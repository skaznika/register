package local.wpr.start.register.service.impl;

import local.wpr.start.register.model.Licensing;
import local.wpr.start.register.repository.LicensingRepository;
import local.wpr.start.register.service.LicensingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LicensingServiceImpl implements LicensingService {
    private static final Logger logger = LoggerFactory.getLogger(LicensingServiceImpl.class);

    @Autowired
    private LicensingRepository licensingRepository;

    public LicensingServiceImpl(LicensingRepository licensingRepository) {
        this.licensingRepository = licensingRepository;
    }

    @Override
    public List<Licensing> getAll() {
        return licensingRepository.findAll();
    }

    @Override
    public Licensing getById(Long licensingId) {
        return licensingRepository.getReferenceById(licensingId);
    }

    public void saveLicensing(Licensing license) {
        licensingRepository.save(license);
    }
}
