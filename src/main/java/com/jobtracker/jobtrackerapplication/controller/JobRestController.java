package com.jobtracker.jobtrackerapplication.controller;

import com.jobtracker.jobtrackerapplication.entity.Job;
import com.jobtracker.jobtrackerapplication.service.JobService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/applications")
@CrossOrigin(origins = "http://localhost:3000")
public class JobRestController {

    private final JobService service;

    public JobRestController(JobService service) {
        this.service = service;
    }

    @PostMapping
    public Job create(@RequestBody Job job) {
        return service.save(job);
    }

    @GetMapping
    public List<Job> getAll() {
        return service.getAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PutMapping("/{id}")
    public Job update(@PathVariable Long id, @RequestBody Job job) {
        return service.update(id, job);
    }


}