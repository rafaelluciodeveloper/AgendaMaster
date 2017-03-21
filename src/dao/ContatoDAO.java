package dao;

import conf.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Contato;

public class ContatoDAO {

    private Conexao conexao;
    private Connection con;
    private PreparedStatement ps;
    private Statement st;
    private ResultSet rs;

    public ContatoDAO() {
        if (con == null) {
            conexao = new Conexao();
            con = conexao.getConexao();
        }
    }

    public void salvar(Contato contato) throws SQLException {
        if (contato.getId() == null) {
            ps = con.prepareStatement("INSERT INTO contatos (nome,telefone,endereco,email) VALUES (?,?,?,?)");
            ps.setString(1, contato.getNome());
            ps.setInt(2, contato.getTelefone());
            ps.setString(3, contato.getEndereço());
            ps.setString(4, contato.getEmail());
            ps.executeUpdate();
            ps.close();
        } else {
            ps = con.prepareStatement("UPDATE contatos SET nome=?,telefone=?,endereco=?,email=? WHERE id=?");
            ps.setString(1, contato.getNome());
            ps.setInt(2, contato.getTelefone());
            ps.setString(3, contato.getEndereço());
            ps.setString(4, contato.getEmail());
            ps.setLong(5, contato.getId());
            ps.executeUpdate();
            ps.close();
        }
    }

    public void excluir(Long id) throws SQLException {
        ps = con.prepareStatement("DELETE FROM contatos WHERE id=?");
        ps.setLong(1,id);
        ps.executeUpdate();
        ps.close();
    }

    public List<Contato> listarTodos() throws SQLException {
        List<Contato> contatos = new ArrayList<Contato>();
        st = con.createStatement();
        rs = st.executeQuery("SELECT * FROM contatos");
        while (rs.next()) {
            Contato c = new Contato();
            c.setId(rs.getLong("id"));
            c.setNome(rs.getString("nome"));
            c.setTelefone(rs.getInt("telefone"));
            c.setEndereço(rs.getString("endereco"));
            c.setEndereço(rs.getString("email"));
            contatos.add(c);
        }
        return contatos;
    }

    public Contato listarPorId(Long id) throws SQLException {
        Contato c = new Contato();
        ps = con.prepareStatement("SELECT * FROM contatos WHERE id=?");
        ps.setLong(1, id);
        rs = ps.executeQuery();
        while (rs.next()) {
            c.setId(rs.getLong("id"));
            c.setNome(rs.getString("nome"));
            c.setTelefone(rs.getInt("telefone"));
            c.setEndereço(rs.getString("endereco"));
            c.setEmail(rs.getString("email"));
        }
        return c;
    }
}
