package com.anmol.ToDoApplication.service;

import com.anmol.ToDoApplication.model.ToDo;
import com.anmol.ToDoApplication.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoService {

    @Autowired
    ToDoRepository toDoRepository;

    public List<ToDo> getAll(){
        return toDoRepository.getAll();
    }

    public ToDo save(ToDo toDo){
        toDo.setId(Math.round(Math.random() * 100));
        return  toDoRepository.save(toDo);
    }

    public void delete(long id){
        toDoRepository.delete(id);
    }

}
