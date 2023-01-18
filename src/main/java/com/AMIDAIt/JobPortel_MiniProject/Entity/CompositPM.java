package com.AMIDAIt.JobPortel_MiniProject.Entity;

import java.io.Serializable;

import javax.persistence.Id;

import lombok.Data;
@Data
public class CompositPM implements Serializable {
    @Id
    private String emailid;

    
    @Id
    private int MobNo;

}
