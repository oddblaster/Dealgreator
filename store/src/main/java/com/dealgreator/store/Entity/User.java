package com.dealgreator.store.Entity;

import javax.persistence.Entity;
import javax.persistence.Table;



@Entity
@Table(name = "Users")
public class User {

    
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
