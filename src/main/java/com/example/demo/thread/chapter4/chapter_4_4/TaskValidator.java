package com.example.demo.thread.chapter4.chapter_4_4;

import java.util.concurrent.Callable;

/**
 * Created by siqingwei on 2018/8/14.
 */
public class TaskValidator implements Callable<String> {
    private String name;
    private String password;
    private UserValidator userValidator;

    public TaskValidator(String name, String password, UserValidator userValidator) {
        this.name = name;
        this.password = password;
        this.userValidator = userValidator;
    }

    @Override
    public String call() throws Exception {
        if (!userValidator.validate(name, password)) {
            System.out.printf("%s : The user has not been found.\n", this.userValidator.getName());
            throw new Exception("Error validating user");
        }

        System.out.printf("%s : The user has been found.\n", this.userValidator.getName());
        return this.userValidator.getName();
    }
}
