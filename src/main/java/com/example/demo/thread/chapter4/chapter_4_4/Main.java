package com.example.demo.thread.chapter4.chapter_4_4;

import org.springframework.aop.target.LazyInitTargetSource;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by siqingwei on 2018/8/14.
 */
public class Main {
    public static void main(String[] args) {
        String name = "test";
        String password = "test";
        UserValidator ldapValidator = new UserValidator("LDAP");
        UserValidator dbValidator = new UserValidator("DB");

        TaskValidator ldapTaskValidtor = new TaskValidator(name, password, ldapValidator);
        TaskValidator dbTaskValidator = new TaskValidator(name, password, dbValidator);

        List<TaskValidator> taskValidatorList = new ArrayList<>(2);
        taskValidatorList.add(ldapTaskValidtor);
        taskValidatorList.add(dbTaskValidator);

        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newCachedThreadPool();
        String result;
        try {
            result = executor.invokeAny(taskValidatorList);
            System.out.printf("Main : Result : %s.\n", result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        executor.shutdown();
        System.out.printf("Main : End Of The Excution.\n");
    }
}
