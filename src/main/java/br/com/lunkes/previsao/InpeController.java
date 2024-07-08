package br.com.lunkes.previsao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/codigo-cidade")
    public String getCodigoDaCidade(@RequestParam(value = "city", required = true) String city) {
        return inpeService.getInpeCodigoCidade(city);
    }

}