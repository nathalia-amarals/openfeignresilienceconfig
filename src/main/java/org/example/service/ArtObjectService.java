package org.example.service;
import lombok.RequiredArgsConstructor;
import org.example.client.MetMuseumClient;
import org.example.payload.ObjectResponse;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ArtObjectService {

    private final MetMuseumClient metMuseumClient;

    public ObjectResponse getObject(int objectId) {
        return metMuseumClient.getObject(objectId);
    }
}

