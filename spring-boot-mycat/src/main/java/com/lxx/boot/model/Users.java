package com.lxx.boot.model;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

@Data
@Accessors(chain = true)
public class Users implements Serializable {
	private static final long serialVersionUID = 1L;

	private long id;
	
	private String name;
	
	private Date indate;
	
}
