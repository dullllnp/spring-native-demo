package com.example.springnativedemo.controller;

import com.example.springnativedemo.model.entity.User;
import com.example.springnativedemo.model.repository.UserRepository;
import com.example.springnativedemo.utils.Result;
import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/user")
@RestController
@Slf4j
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Operation(summary = "list")
    @GetMapping("/list")
    public Result list(){
        List<User> list = userRepository.findAll();
        log.info("user list: "+ list);
        return Result.ok(list);
    }

    @Operation(summary = "add")
    @PostMapping("/add")
    public Result add(@RequestBody User user){
        userRepository.saveAndFlush(user);
        log.info("add user: "+ user);
        return Result.ok(user);
    }
}
