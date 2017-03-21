package conf;

import java.util.HashMap;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class Relatorio {

    private static Conexao c;

    public Relatorio() {
        c = new Conexao();
    }

    public void imprimir(String relatorio) {
        JasperPrint relat;
        try {
            JDialog viewer = new JDialog(new javax.swing.JFrame(), "Maratona Programção - Visualização do Relatório", true);
            viewer.setSize(900, 600);
            viewer.setLocationRelativeTo(null);

            relat = gerar(relatorio);
            JasperViewer jrViewer = new JasperViewer(relat, true);
            viewer.getContentPane().add(jrViewer.getContentPane());
            viewer.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public JasperPrint gerar(String arquivoJasper) {
        JasperPrint rel = null;
        try {
            HashMap map = new HashMap();
            rel = JasperFillManager.fillReport("src/report/" + arquivoJasper, map, c.getConexao());
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return rel;
    }
}
