package com.anmol.ToDoApplication.repository;

import com.anmol.ToDoApplication.model.ToDo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class ToDoRepository {

    private List<ToDo> toDoList = new ArrayList<>();

    public List<ToDo> getAll(){
        return toDoList;
    }

    public ToDo save(ToDo toDo){
        boolean add = toDoList.add(toDo);
        return  toDo;
    }

    public void delete(long id){
       toDoList = toDoList.stream().filter(el -> el.getId() != id).collect(Collectors.toList());
    }


}
