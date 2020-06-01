package com.example.bodyleasing.project.domain.project;

import com.example.bodyleasing.commontypes.ProjectId;
import com.example.bodyleasing.microarchitecture.Aggregate;
import com.example.bodyleasing.microarchitecture.AggregateBuilder;
import lombok.Builder;
import lombok.Data;

@Data
@Aggregate
public class Project {

    private ProjectId projectId;
    private String name;

    @Builder
    @AggregateBuilder
    public static class projectBuilder {

        private ProjectId projectId;
        private String name;
    }
}
