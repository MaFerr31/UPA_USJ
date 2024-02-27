
package com.mycompany.projetoa3;


public class Funcionario {
    
    private String login;
    private String senha;
    private int id;

    public Funcionario(String login, String senha, int id) {
        this.login = login;
        this.senha = senha;
        this.id = id;
        
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
}
