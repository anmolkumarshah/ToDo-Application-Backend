package com.anmol.ToDoApplication.controller;

import com.anmol.ToDoApplication.model.ToDo;
import com.anmol.ToDoApplication.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo")
public class ToDoController {
    @Autowired
    ToDoService toDoService;

    @GetMapping
    public ResponseEntity<List<ToDo>> getAllToDo(){
        return  ResponseEntity.ok(toDoService.getAll());
    }

    @PostMapping
    public ResponseEntity<ToDo> save(@RequestBody ToDo toDo){
        return ResponseEntity.ok(toDoService.save(toDo));
    }

    @DeleteMapping("/{id}")
    public  ResponseEntity<String> delete(@PathVariable("id")  Long id){
        toDoService.delete(id);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("ToDo is deleted with id "+id);
    }

}
