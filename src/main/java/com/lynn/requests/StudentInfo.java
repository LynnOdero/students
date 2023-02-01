package com.lynn.requests;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class StudentInfo {
    public Integer id;

    public String name;
    public String admissionNo;
    public String streamName;
}
