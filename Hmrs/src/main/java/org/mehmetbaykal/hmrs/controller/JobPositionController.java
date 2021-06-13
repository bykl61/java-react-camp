package org.mehmetbaykal.hmrs.controller;

import lombok.RequiredArgsConstructor;
import org.mehmetbaykal.hmrs.entities.JobPosition;
import org.mehmetbaykal.hmrs.service.JobPositonService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;


@RestController
@RequestMapping("/api/jobs")
@RequiredArgsConstructor
public class JobPositionController {

    private final JobPositonService jobPositonService;

    @GetMapping("/getAll")
    public Collection<JobPosition> list(){
       return jobPositonService.list();
    }

    @PostMapping
    public JobPosition crud(@RequestBody JobPosition jobPosition){
        return jobPositonService.crud(jobPosition);
    }
}
