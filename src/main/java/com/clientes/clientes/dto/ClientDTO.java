package com.clientes.clientes.dto;

import java.time.LocalDate;

public class ClientDTO {

    private Long id;
    private String nome;
    private String cpf;
    private Double income;
    private LocalDate birthDate;

    public ClientDTO() {}

    public ClientDTO(Long id, String nome, String cpf, Double income, LocalDate birthDate) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.income = income;
        this.birthDate = birthDate;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Double getIncome() {
        return income;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }
}
