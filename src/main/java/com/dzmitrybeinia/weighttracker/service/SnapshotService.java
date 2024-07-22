package com.dzmitrybeinia.weighttracker.service;

import com.dzmitrybeinia.weighttracker.model.Snapshot;
import com.dzmitrybeinia.weighttracker.repository.SnapshotRepo;
import org.springframework.stereotype.Service;

import java.time.Instant;


@Service
public class SnapshotService {
    private final SnapshotRepo snapshotRepo;

    public SnapshotService(SnapshotRepo snapshotRepo) {
        this.snapshotRepo = snapshotRepo;
    }

    public Snapshot saveSnapshot(Snapshot snapshot) {
        snapshot.setDate(Instant.now());
        return snapshotRepo.insert(snapshot);
    }

    public Snapshot getSnapshotById(String id) {
        return snapshotRepo.findById(id).orElseThrow(
                () -> new RuntimeException("Cannot find snapshot with id = %s".formatted(id))
        );
    }
}
