package com.anmol.ToDoApplication.model;


import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ToDo {

    long id;

    String title;

}
