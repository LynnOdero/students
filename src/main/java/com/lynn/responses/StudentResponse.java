package com.lynn.responses;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class StudentResponse {
    public boolean status;
    public String message;

    public Integer id;
}
