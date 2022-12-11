/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.projetocosnnectcorrecao;

/**
 *
 * @author MatheusA
 */
public class Ingressos extends Usuario{
    
   private double preco;
   private int quantidade = 100;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String getNomeUser() {
        return super.getNomeUser();
    }

    @Override
    public String toString() {
        return "Ingressos{" + "preco=" + preco + ", quantidade=" + quantidade + '}';
    }

    
    
}
