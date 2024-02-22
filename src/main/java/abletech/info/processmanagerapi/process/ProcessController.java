package abletech.info.processmanagerapi.process;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import abletech.info.processmanagerapi.process.dto.request.CreateProcessRequest;
import abletech.info.processmanagerapi.process.dto.request.DeleteProcessRequest;
import abletech.info.processmanagerapi.process.dto.request.UpdateProcessStatusRequest;
import abletech.info.processmanagerapi.process.dto.response.GetProcessByIdResponse;
import abletech.info.processmanagerapi.process.model.Process;

import java.util.Optional;

@RestController
@RequestMapping("process")
public class ProcessController {

    private final transient ProcessService processService;

    public ProcessController(ProcessService processService) {
        this.processService = processService;
    }

    @GetMapping()
    public ResponseEntity<GetProcessByIdResponse> findById(@RequestParam("id") String id) {
        Process process = processService.findById(id);

        return ResponseEntity.ok(GetProcessByIdResponse.builder().process(process).build());
    }

    @PutMapping(value = "/status")
    public ResponseEntity<Void> changeUsername(
            @Validated @RequestBody UpdateProcessStatusRequest request) {
        Optional<Process> process = processService.updateStatus(request);

        if (process.isPresent()) {
            return ResponseEntity.ok().build();
        }

        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Void> createProcess(@Validated @RequestBody CreateProcessRequest request) {
        processService.create(request);

        return ResponseEntity.ok().build();
    }

    @DeleteMapping()
    public ResponseEntity<Void> deleteProcess(@Validated @RequestBody DeleteProcessRequest request) {
        Optional<Process> process = processService.delete(request);

        if (process.isPresent()) {
            return ResponseEntity.ok().build();
        }

        return ResponseEntity.notFound().build();
    }
}
