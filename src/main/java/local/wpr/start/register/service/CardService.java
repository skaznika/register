package local.wpr.start.register.service;

import local.wpr.start.register.model.Card;

import java.util.List;

public interface CardService {
    Card getById(Long cardId);
    List<Card> getAll();
}
