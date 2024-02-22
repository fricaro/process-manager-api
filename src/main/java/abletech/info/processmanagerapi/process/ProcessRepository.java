package abletech.info.processmanagerapi.process;

import abletech.info.processmanagerapi.process.model.Process;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProcessRepository extends MongoRepository<Process, String> {

}
