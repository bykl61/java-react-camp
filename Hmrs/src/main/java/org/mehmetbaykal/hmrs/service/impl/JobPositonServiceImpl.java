package org.mehmetbaykal.hmrs.service.impl;

import lombok.RequiredArgsConstructor;
import org.mehmetbaykal.hmrs.dao.JobPositionRepository;
import org.mehmetbaykal.hmrs.entities.JobPosition;
import org.mehmetbaykal.hmrs.service.JobPositonService;
import org.springframework.stereotype.Service;

import java.util.Collection;
@Service
@RequiredArgsConstructor
public class JobPositonServiceImpl implements JobPositonService {

    private final JobPositionRepository jobPositionRepository;

    @Override
    public Collection<JobPosition> list() {
        return jobPositionRepository.findAll();
    }

    @Override
    public JobPosition crud(JobPosition jobPosition) {
        return jobPositionRepository.save(jobPosition);
    }
}
