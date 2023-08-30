package local.wpr.start.register.service.impl;

import local.wpr.start.register.model.Card;
import local.wpr.start.register.repository.CardRepository;
import local.wpr.start.register.service.CardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardServiceImpl implements CardService {
    private static final Logger logger = LoggerFactory.getLogger(CardServiceImpl.class);
    @Autowired
    private CardRepository cardRepository;

    public CardServiceImpl(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    @Override
    public Card getById(Long cardId) {
        return cardRepository.getReferenceById(cardId);
    }

    @Override
    public List<Card> getAll() {
        return cardRepository.findAll();
    }

    public List<Card> getAllCards() {
        return cardRepository.findAllCards();
    }

    public void saveCard(Card card) {
        cardRepository.save(card);
    }
}
