package org.mehmetbaykal.hmrs.dao;

import org.mehmetbaykal.hmrs.entities.JobPosition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobPositionRepository extends JpaRepository<JobPosition,Long> {
}
