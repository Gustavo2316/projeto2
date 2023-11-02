package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity

public class Usuario {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 private String nome;
private String cpf;
private String email;
private String endereco;

 public void setNome(String nome) {}

public void setCpf(String cpf) {}

public void setEmail(String email) {}

public void setEndereco(String endereco) {}

    // getters and setters
}
