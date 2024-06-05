package com.example.dockerspring.repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class RepositoryL {
    ArrayList<String> arrayList = new ArrayList<>();

    public void add(String s) {
        arrayList.add(s);
    }

    public ArrayList<String> findall() {
     return arrayList;

    }

    public void delete(int id) {
        arrayList.remove(id);
    }
}
