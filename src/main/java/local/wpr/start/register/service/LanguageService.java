package local.wpr.start.register.service;

import local.wpr.start.register.model.Language;

import java.util.List;

public interface LanguageService {
    List<Language> getAll();
    Language getById(Long languageId);

}
