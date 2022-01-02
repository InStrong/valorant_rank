package com.example.valorant_rank.Service;

import com.example.valorant_rank.rest.MmrData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@Service
public class MmrService {

    private final String RANK_URL = "https://api.henrikdev.xyz/valorant/v1/mmr/eu/";

    public MmrData getMmrData(String name, String tag) {
        RestTemplate restTemplate = new RestTemplate();
        try {
            ResponseEntity<MmrData> test = restTemplate.getForEntity(RANK_URL + name + "/" + tag, MmrData.class);
            return test.getBody();
        }
        catch (final HttpClientErrorException e) {
            return null;
        }
    }

}
