package org.example;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/met")
@RequiredArgsConstructor
public class ObjectController {

    private final ArtObjectService artObjectService;

    @GetMapping("/object/{object_id}")
    public ResponseEntity getObject(@PathVariable("object_id") int objectId){
        return  ResponseEntity.ok(artObjectService.getObject(objectId));
    }
}
