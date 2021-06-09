package org.mehmetbaykal.hmrs.service;

import org.mehmetbaykal.hmrs.entities.JobPosition;

import java.util.Collection;
import java.util.List;

public interface JobPositonService {
    Collection<JobPosition> list();

    JobPosition crud(JobPosition jobPosition);
}
