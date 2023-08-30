package local.wpr.start.register.service.impl;

import local.wpr.start.register.model.Language;
import local.wpr.start.register.repository.LanguageRepository;
import local.wpr.start.register.service.LanguageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageServiceImpl implements LanguageService {
    private static final Logger logger = LoggerFactory.getLogger(LanguageServiceImpl.class);

    @Autowired
    private LanguageRepository languageRepository;

    public LanguageServiceImpl(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @Override
    public List<Language> getAll() {
        return languageRepository.findAll();
    }

    @Override
    public Language getById(Long languageId) {
        return languageRepository.getReferenceById(languageId);
    }

    public void addLanguage(Language language) {
        languageRepository.save(language);
    }
}
