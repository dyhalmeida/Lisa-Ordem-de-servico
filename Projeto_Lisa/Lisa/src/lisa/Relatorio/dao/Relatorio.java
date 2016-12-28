package lisa.Relatorio.dao;

import java.sql.Connection;
import java.util.HashMap;
import lisa.BancoDeDados.BancoDeDados;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class Relatorio {

    //Atributo
    private Connection conexao = null;
    
    //Construtor setando o atributo conexão com uma conexão aberta do banco de dados.
    public Relatorio() {
        setConexao(BancoDeDados.getConnection());
    }

    /**
     * Método para criar relatório total de vendas
     * @param dataSaida É um valor string contendo a data de saída do produto.
     */
    public void relatorioTotalVendas(String dataSaida) {

        try {
            //Criando objeto do tipo HasMap
            HashMap dataS = new HashMap();
            dataS.put("dataEntrega", dataSaida);
            //Criando objeto do tipo JasperPrint e atribuindo caminho da API, a condição do where e uma conexão do banco aberta.
            JasperPrint relServicos = JasperFillManager.fillReport("F:/Repositório_git_hub/Projeto_Lisa_OS/Project-lisa-os-2016/API/rel_os.jasper", dataS, getConexao());
            
            //Abrindo tela de leitor do documento passando o relatório.
            JasperViewer.viewReport(relServicos, false);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void relatorioOS(String id) {
        try {

            HashMap idOS = new HashMap();
            idOS.put("ID", Integer.parseInt(id));
            JasperPrint relServicos = JasperFillManager.fillReport("F:/Repositório_git_hub/Projeto_Lisa_OS/Project-lisa-os-2016/API/lisa_rel_os.jasper", idOS, getConexao());

            JasperViewer.viewReport(relServicos, false);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Connection getConexao() {
        return conexao;
    }

    private void setConexao(Connection conexao) {
        this.conexao = conexao;
    }

}
