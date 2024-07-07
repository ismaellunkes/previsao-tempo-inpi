package br.com.lunkes.previsao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/inpe")
public class InpeController {

    private final InpeService inpeService;

    @Autowired
    public InpeController(InpeService inpeService) {
        this.inpeService = inpeService;
    }
    @GetMapping("/docs")
    public String getInpeData() {
        return inpeService.getInpeData();
    }

}