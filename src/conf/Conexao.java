package conf;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private Connection connection;

    public Conexao() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda?createDatabaseIfNotExist=true", "root", "");
            System.out.println("Conexão Efetuada com Suscesso");
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
            System.out.println("Não Foi Possivel Afetuar Conexao");
        }
    }

    public Connection getConexao() {
        return connection;
    }
    
    public static void main(String[] args) {
        Conexao con =  new Conexao();
        con.getConexao();
    }
}
