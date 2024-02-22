package abletech.info.processmanagerapi.process.dto.request;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@JsonAutoDetect
@NoArgsConstructor
@AllArgsConstructor
public class DeleteProcessRequest {
  String processId;
}
