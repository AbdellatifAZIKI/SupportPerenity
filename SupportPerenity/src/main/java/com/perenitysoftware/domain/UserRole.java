package com.perenitysoftware.domain;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="user_roles")
@Data	@AllArgsConstructor	 @NoArgsConstructor
public class UserRole {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name="user_role_id")
private Long userroleid;

@Column(name="userid")
private Long userid;

@Column(name="role")
private String role; 
}
