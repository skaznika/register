package local.wpr.start.register.service;

import local.wpr.start.register.model.AccesServerRoom;

import java.util.List;

public interface AccessServerRoomService {
//    AccesServerRoom getRoom();
    List<AccesServerRoom> getAll();
    AccesServerRoom getById(Long id);
}
