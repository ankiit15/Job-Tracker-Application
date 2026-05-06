package com.jobtracker.jobtrackerapplication.service;

import com.jobtracker.jobtrackerapplication.entity.Job;
import com.jobtracker.jobtrackerapplication.repository.JobRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    private final JobRepository repo;

    public JobService(JobRepository repo) {
        this.repo = repo;
    }

    public Job save(Job job) {
        return repo.save(job);
    }

    public List<Job> getAll() {
        return repo.findAll();
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

    public Job update(Long id, Job updatedJob) {
        Job job = repo.findById(id).orElseThrow();

        job.setStatus(updatedJob.getStatus());

        return repo.save(job);
    }
}