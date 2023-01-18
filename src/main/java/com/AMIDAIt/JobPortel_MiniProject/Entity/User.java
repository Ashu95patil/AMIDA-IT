package com.AMIDAIt.JobPortel_MiniProject.Entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="User_Register")
@IdClass(value = CompositPM.class)
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="User_Id")
	private Integer userid;
	
	@Column(name="User_Name")
    private String name;
	
	@Column(name="User_Emailid")
    private String emailid;
	
	@Column(name="User_Emailid")
    private String password;
	
	@Column(name="User_MobNo")
     private long MobNo;
	
	@Column(name="Create_date",updatable =  false)
    @CreationTimestamp
	private LocalDateTime createdatetime;
	
	@Column(name="update_date", insertable = false)
	@UpdateTimestamp
	private LocalDateTime updatedateTime;
	
	@Column(name="Isactive_switch")
    private Character isactive;

}
