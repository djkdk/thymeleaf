package com.qf.thymeleaf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author
 * @Date ${Date}
 */
@Data
@AllArgsConstructor
public class Teacher {
    private Integer id;
    private String name;
    private Integer age;
}
