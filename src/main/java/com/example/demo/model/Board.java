package com.example.demo.model;

import java.sql.*;
import java.util.Date;
import lombok.Data;

@Data
public class Board {

	private int content_no;
	private String content_title;
	private String content_text;
	private Date content_writedate;
	private int content_views;	
}
