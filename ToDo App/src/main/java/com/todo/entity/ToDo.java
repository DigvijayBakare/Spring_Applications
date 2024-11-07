package com.todo.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ToDo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int todoId;
    private String todoTitle;
    @Column(length = 5000)
    private String todoContent;
    private Date todoDate;

    @Override
    public String toString() {
        return this.getTodoTitle() + " : " + this.todoContent;
    }
}
