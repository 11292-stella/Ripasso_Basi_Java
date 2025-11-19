package org.example.CollegamentoDatabase;

import javax.persistence.*;
@Entity
public class Utente {

    // 1. Entity
    // Una Entity è una classe Java che rappresenta una tabella del database.
    // L’annotazione @Entity dice a JPA/Hibernate: “Questa classe va mappata su una tabella”.
    // Ogni campo della classe diventa una colonna della tabella.
    // Devi avere una chiave primaria (@Id), che identifica univocamente ogni record.

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto-incrementa
    private Long id;

    private String nome;
    private String email;

    // Risultato: Hibernate crea una tabella "utente" con colonne id, nome, email.

    // Costruttori
    public Utente() {}
    public Utente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    // Getters e setters
    public Long getId() { return id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    @Override
    public String toString() {
        return "Utente{id=" + id + ", nome='" + nome + "', email='" + email + "'}";
    }
}