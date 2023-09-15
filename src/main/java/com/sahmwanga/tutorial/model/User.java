// package com.sahmwanga.tutorial.model;

// import java.util.HashSet;
// import java.util.Set;

// import jakarta.persistence.Column;
// import jakarta.persistence.Entity;
// import jakarta.persistence.FetchType;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.JoinColumn;
// import jakarta.persistence.JoinTable;
// import jakarta.persistence.ManyToMany;
// import jakarta.persistence.Table;
// import jakarta.persistence.UniqueConstraint;

// @Entity
// @Table(name = "users", uniqueConstraints = {
// @UniqueConstraint(columnNames = "username"),
// @UniqueConstraint(columnNames = "email")
// })
// public class User {
// @Id
// @GeneratedValue(strategy = GenerationType.IDENTITY)
// private Long id;

// @Column(name = "username")
// private String username;

// @Column(name = "email")
// private String email;

// @Column(name = "password")
// private String password;

// @ManyToMany(fetch = FetchType.LAZY)
// @JoinTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_id"),
// inverseJoinColumns = @JoinColumn(name = "role_id"))
// private Set<Role> roles = new HashSet<>();

// public User() {
// }

// public User(String username, String email, String password) {
// this.username = username;
// this.email = email;
// this.password = password;
// }

// public Long getId() {
// return id;
// }

// public void setId(Long id) {
// this.id = id;
// }

// public String getUsername() {
// return username;
// }

// public void setUsername(String username) {
// this.username = username;
// }

// public String getEmail() {
// return email;
// }

// public void setEmail(String email) {
// this.email = email;
// }

// public String getPassword() {
// return password;
// }

// public void setPassword(String password) {
// this.password = password;
// }

// public Set<Role> getRoles() {
// return roles;
// }

// public void setRoles(Set<Role> roles) {
// this.roles = roles;
// }
// }
