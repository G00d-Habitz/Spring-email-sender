package com.g00dhabitz.SpringMailDemo.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Email {
    private String email;
    private String subject;
    private String text;
}
