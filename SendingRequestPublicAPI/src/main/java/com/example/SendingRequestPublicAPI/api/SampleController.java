package com.example.SendingRequestPublicAPI.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@CrossOrigin
public class SampleController {

    // I added CrossOrigin annotation
    //because sometimes it throws Access-Control-Allow-Origin exception .

    @GetMapping(value = "/sendRequestToPublicApi")
    public String sendRequestApi() {
        String uri = "https://coffee.alexflipnote.dev/random.json";
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);
        return result;
    }


}
