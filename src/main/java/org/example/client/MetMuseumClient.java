package org.example.client;
import org.example.payload.ObjectResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "metMuseumClient", url = "https://collectionapi.metmuseum.org/public/collection/v1")
public interface MetMuseumClient {

    @GetMapping("/objects/{object_id}")
    ObjectResponse getObject(@PathVariable("object_id")int objectId);
}
