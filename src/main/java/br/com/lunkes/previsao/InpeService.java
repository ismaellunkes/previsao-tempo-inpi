package br.com.lunkes.previsao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class InpeService {

    private final RestTemplate restTemplate;

    @Value("${base.url.inpe}")
    private String baseUrlInpe;

    @Autowired
    public InpeService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getInpeData() {
        return restTemplate.getForObject(baseUrlInpe, String.class);
    }
}
