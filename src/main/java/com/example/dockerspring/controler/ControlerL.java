package com.example.dockerspring.controler;

import com.example.dockerspring.repository.RepositoryL;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api")
public class ControlerL {

    public ControlerL(RepositoryL repositoryL) {
        this.repositoryL = repositoryL;
    }

    private final RepositoryL repositoryL;

    @PostMapping("/add/{s}")
    public void add(@PathVariable String s) {
        repositoryL.add(s);
    }
    @GetMapping("/findall")
    public ArrayList<String> findall(){
     return    repositoryL.findall();
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id){
        repositoryL.delete(id);
    }
}
