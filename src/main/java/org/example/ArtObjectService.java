package org.example;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ArtObjectService {

    private final MetMuseumClient metMuseumClient;

    public ObjectResponse getObject(int objectId) {
        return metMuseumClient.getObject(objectId);
    }
}

