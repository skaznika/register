package local.wpr.start.register.service.impl;

import local.wpr.start.register.model.Position;
import local.wpr.start.register.repository.PositionRepository;
import local.wpr.start.register.service.PositionService;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionServiceImpl implements PositionService {
    private static final Logger logger = LoggerFactory.getLogger(PositionServiceImpl.class);

    @Autowired
    private PositionRepository positionRepository;

    public PositionServiceImpl(PositionRepository positionRepository) {
        this.positionRepository = positionRepository;
    }

    @Override
    public List<Position> getAllPosition() {
        return positionRepository.findAll();
    }

    @Override
    public Position getById(Long positionId) {
        return positionRepository.getReferenceById(positionId);
    }
}
