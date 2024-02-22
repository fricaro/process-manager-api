package abletech.info.processmanagerapi.process.dto.request;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import abletech.info.processmanagerapi.process.enums.ProcessStatusEnum;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@JsonAutoDetect
@NoArgsConstructor
public class UpdateProcessStatusRequest {
  String processId;
  ProcessStatusEnum status;
}
