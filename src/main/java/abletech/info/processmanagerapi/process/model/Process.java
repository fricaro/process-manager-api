package abletech.info.processmanagerapi.process.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import abletech.info.processmanagerapi.process.enums.ProcessStatusEnum;
import abletech.info.processmanagerapi.process.enums.ProcessTypeEnum;
import lombok.Builder;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "processes")
public class Process {

    @Id
    private String id;

    @CreatedDate
    private Date createdAt;

    @LastModifiedDate
    private Date updatedAt;

    private String name;
    private ProcessTypeEnum type;
    private ProcessStatusEnum status;
    private String startDate;
    private String finishDate;
}