package com.orez.springboot_validation.model;

import lombok.Data;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class User {
    @NotNull(message = "ID 입력")
    @Size(min = 5, max = 10, message = "5~10글자 이내")
    private String id;

    @Min(value = 15, message = "15세 이상")
    private int age;
}
