package com.dzmitrybeinia.weighttracker.controller;

import com.dzmitrybeinia.weighttracker.model.Snapshot;
import com.dzmitrybeinia.weighttracker.service.SnapshotService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@RequestMapping("/snapshots")
public class SnapshotController {
    private final SnapshotService snapshotService;

    public SnapshotController(SnapshotService snapshotService) {
        this.snapshotService = snapshotService;
    }

    @PostMapping
    public ResponseEntity<Snapshot> createSnapshot(@RequestBody Snapshot snapshot) {
        return ResponseEntity.ok().body(snapshotService.saveSnapshot(snapshot));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Snapshot> findSnapshotById(@PathVariable("id") String id) {
        return ResponseEntity.ok().body(snapshotService.getSnapshotById(id));
    }
}
