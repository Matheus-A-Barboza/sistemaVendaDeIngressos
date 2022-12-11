package br.com.projetocosnnectcorrecao;

import java.util.ArrayList;

/**
 *
 * @author MatheusA
 */
public class Usuario {
    
    private String nomeUser;
    private String email;
    private String senha;

    public String getNomeUser() {
        return nomeUser;
    }

    public void setNomeUser(String nomeUser) {
        this.nomeUser = nomeUser;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public void comprarIngresso(double preco){
        
    }
    
    ArrayList userCadastrado = new ArrayList();
    
    
    
}
