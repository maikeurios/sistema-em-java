/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dispositivosmoveis.dal;

import java.sql.*;

/**
 *
 * @author maike
 */
public class ModuloConexao {
//responsável por estabelecer a conexão com banco de dados

    public static Connection conector() {
        java.sql.Connection conexao = null;
//a linha abaixo "chama" driver
        String driver = "com.mysql.jdbc.Driver";
//informações referente ao banco de dados
        String url = "jdbc:mysql://desmobile.mysql.uhserver.com/desmobile";
        String user = "alunos2020";
        String password = "@Aluno2020";
//estabelecendo a conexão com o banco de dados
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

}
