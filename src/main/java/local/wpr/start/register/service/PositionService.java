package local.wpr.start.register.service;

import local.wpr.start.register.model.Position;

import java.util.List;

public interface PositionService {
    List<Position> getAllPosition();
    Position getById(Long positionId);
}
