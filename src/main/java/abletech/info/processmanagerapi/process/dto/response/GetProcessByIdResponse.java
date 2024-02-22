package abletech.info.processmanagerapi.process.dto.response;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import abletech.info.processmanagerapi.process.model.Process;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@JsonAutoDetect
@AllArgsConstructor
@NoArgsConstructor
public class GetProcessByIdResponse {
  Process process;
}
