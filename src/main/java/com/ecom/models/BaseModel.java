package com.ecom.models;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
public class BaseModel implements Serializable {
    private Long id;
    private String name;
    private int userId;
    private Date created;
    private Date updated;
    private boolean deleted;
}
