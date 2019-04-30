package com.lxx.boot.model;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
public class User implements Serializable {

	private long id;

    private String name;

    private Long date;

	private Long userid;
	
}
