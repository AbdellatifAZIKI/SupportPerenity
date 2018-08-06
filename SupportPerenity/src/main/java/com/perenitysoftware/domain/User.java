package com.perenitysoftware.domain;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@Data	@AllArgsConstructor	@NoArgsConstructor
public class User implements Serializable {

private static final long serialVersionUID = 1L;

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name="userid")
private Long userId;

@Column(name = "username")
private String userName;

@Column(name = "password")
private String password;

@Column(name = "email")
private String email;

@Column(name ="enabled")
private int enabled;

@OneToMany(fetch=FetchType.EAGER)
private Collection<UserRole> roles=new ArrayList<>();

}
