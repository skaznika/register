package local.wpr.start.register.service.impl;

import local.wpr.start.register.model.AccesServerRoom;
import local.wpr.start.register.repository.AccesServerRoomRepository;
import local.wpr.start.register.service.AccessServerRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccessServerRoomServiceImpl implements AccessServerRoomService {
    @Autowired
    private AccesServerRoomRepository accesServerRoomRepository;

    public AccessServerRoomServiceImpl(AccesServerRoomRepository accesServerRoomRepository) {
        this.accesServerRoomRepository = accesServerRoomRepository;
    }

//    @Override
//    public AccesServerRoom getRoom() {
//        Example<AccesServerRoom> AccesServerRoom;
//        return accesServerRoomRepository.findOne(AccesServerRoom);
//    }

    @Override
    public List<AccesServerRoom> getAll() {
        return accesServerRoomRepository.findAll();
    }

    @Override
    public AccesServerRoom getById(Long id) {
        return accesServerRoomRepository.getReferenceById(id);
    }

    public void save(AccesServerRoom accesServerRoom) {
        accesServerRoomRepository.save(accesServerRoom);
    }
}
