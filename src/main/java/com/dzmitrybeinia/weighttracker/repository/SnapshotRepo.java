package com.dzmitrybeinia.weighttracker.repository;

import com.dzmitrybeinia.weighttracker.model.Snapshot;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SnapshotRepo extends MongoRepository<Snapshot, String> {
}
