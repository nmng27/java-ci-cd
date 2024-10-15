package br.com.fiap.projetoAPI.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "TB_USUARIO")
public class Usuario {
    @Id
    @Column(name = "ID_USUARIO")
    private Integer id;
    @Column(name = "USERNAME_USUARIO")
    private String username;
    @Column(name = "SENHA_USUARIO")
    private String senha;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
