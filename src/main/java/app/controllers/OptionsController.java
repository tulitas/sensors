package app.controllers;

import app.models.Metrics;
import app.proces.MakeConnection;
import app.repositories.MetricRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(name = "/")
public class OptionsController {

    private MakeConnection makeConnection;

    private  MetricRepository metricRepository;

    public OptionsController(MetricRepository metricRepository) {
        this.metricRepository = metricRepository;
    }

    public OptionsController() {

    }


    @GetMapping(value = "/take")
    public List<Metrics> getAllMetrics() {
        System.out.println("sss");
        System.out.println(metricRepository.findAll());
        return (List<Metrics>) metricRepository.findAll();
    }

}
