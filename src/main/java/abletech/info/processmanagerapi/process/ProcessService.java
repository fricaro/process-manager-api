package abletech.info.processmanagerapi.process;

import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import abletech.info.processmanagerapi.process.dto.request.CreateProcessRequest;
import abletech.info.processmanagerapi.process.dto.request.DeleteProcessRequest;
import abletech.info.processmanagerapi.process.dto.request.UpdateProcessStatusRequest;
import abletech.info.processmanagerapi.process.enums.ProcessStatusEnum;
import abletech.info.processmanagerapi.process.model.Process;

import java.util.Optional;

@Service
public class ProcessService {

    private final transient ProcessRepository processRepository;

    public ProcessService(ProcessRepository processRepository) {
        this.processRepository = processRepository;
    }

    public Process findById(String id) {
        return this.processRepository.findById(id).orElse(null);
    }

    public Optional<Process> updateStatus(UpdateProcessStatusRequest request) {
        Process process = this.findById(request.getProcessId());

        if (process != null) {
            process.setStatus(request.getStatus());

            return Optional.of(this.processRepository.save(process));
        }

        return null;
    }

    public void create(CreateProcessRequest request) {
        Process process = Process.builder()
                .type(request.getType())
                .name(request.getName())
                .status(ProcessStatusEnum.CREATED)
                .startDate(request.getStartDate())
                .finishDate(request.getFinishDate())
                .userId(new ObjectId(request.getUserId()))
                .build();

        this.processRepository.save(process);
    }

    public Optional<Process> delete(DeleteProcessRequest request) {
        Process process = this.findById(request.getProcessId());

        if (process != null) {
            processRepository.delete(process);

            return Optional.of(process);
        }

        return null;
    }
}
