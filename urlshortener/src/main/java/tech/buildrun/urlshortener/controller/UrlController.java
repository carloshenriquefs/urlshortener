package tech.buildrun.urlshortener.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tech.buildrun.urlshortener.dto.ShortenerUrlRequest;

@RestController
public class UrlController {

    @PostMapping(value = "/shorten-url")
    public ResponseEntity<?> shortenUrl(@RequestBody ShortenerUrlRequest shortenerUrlRequest) {
        return ResponseEntity.ok().build();
    }

}
