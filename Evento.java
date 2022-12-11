/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.projetocosnnectcorrecao;

/**
 *
 * @author MatheusA
 */
public class Evento extends EnderecoEvento {
    
    //EnderecoEvento ee = new EnderecoEvento();
    
    private String nomeEvento;
    private String numeroDeTelefone;
    private String email;

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public String getNumeroDeTelefone() {
        return numeroDeTelefone;
    }

    public void setNumeroDeTelefone(String numeroDeTelefone) {
        this.numeroDeTelefone = numeroDeTelefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void venderIngresso(){
        
    }

    @Override
    public String getEstado() {
        return super.getEstado();
    }

    @Override
    public String getCidade() {
        return super.getCidade();
    }

    @Override
    public String getRua() {
        return super.getRua();
    }
    
    
    
}
