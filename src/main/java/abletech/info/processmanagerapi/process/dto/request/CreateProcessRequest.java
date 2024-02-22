package abletech.info.processmanagerapi.process.dto.request;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import abletech.info.processmanagerapi.process.enums.ProcessTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@JsonAutoDetect
@NoArgsConstructor
@AllArgsConstructor
public class CreateProcessRequest {
  private ProcessTypeEnum type;
  private String name;
  private String startDate;
  private String finishDate;
}
