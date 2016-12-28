package com.lisa.appBanco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class NewBanco {

    private LisaConnectionBD lisaConnection;
    private Connection conexao;
    private String sql;
    private PreparedStatement pstm;
    private ResultSet rs;

    public NewBanco(String senha) {
        lisaConnection = new LisaConnectionBD(senha);
    }

    private String getSql() {
        return sql;
    }

    private void setSql(String sql) {
        this.sql = sql;
    }

    private Connection getConexao() {
        return conexao;
    }

    private PreparedStatement getPstm() {
        return pstm;
    }

    private void setPstm(PreparedStatement pstm) {
        this.pstm = pstm;
    }

    private ResultSet getRs() {
        return rs;
    }

    private void setRs(ResultSet rs) {
        this.rs = rs;
    }

    private void setConexao(Connection conexao) {
        this.conexao = conexao;
    }

    public boolean createTableUsuario() {

        setSql(
                "create table tb_usuario("
                + "id_usuario integer not null,"
                + " nome_usuario varchar(50) null,"
                + " sobrenome_usuario varchar(50) null,"
                + " login_usuario varchar(15) not null unique, "
                + "senha_usuario varchar(8) not null,"
                + " constraint pk_usuario primary key(id_usuario))"
        );

        try {
            setConexao(lisaConnection.getConnection());
            setPstm(getConexao().prepareStatement(getSql()));

            setRs(getPstm().executeQuery());
            if (getRs() != null) {
                createUsuAdm();
                return true;
            } else {
                return false;
            }

        } catch (SQLException e) {
            System.out.println("Erro ao criar tabela usuario: " + e.getMessage());
            return false;
        } finally {
            lisaConnection.closeConnection(getConexao(), getPstm(), getRs());
        }
    }

    public boolean createTableProfissional() {

        setSql(
                "create table tb_profissional("
                + "id_profissional integer not null, "
                + "nome_profissional varchar(50) not null, "
                + "sobrenome_profissional varchar(50) not null, "
                + "constraint pk_profissional primary key(id_profissional))"
        );

        try {
            setConexao(lisaConnection.getConnection());
            setPstm(getConexao().prepareStatement(getSql()));

            setRs(getPstm().executeQuery());
            if (getRs() != null) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException e) {
            System.out.println("Erro ao criar tabela Profissional: " + e.getMessage());
            return false;
        } finally {
            lisaConnection.closeConnection(getConexao(), getPstm(), getRs());
        }
    }

    public boolean createTableCidade() {
        setSql(
                "create table tb_cidade(\n"
                + "id_cidade integer not null,\n"
                + "nome_cidade varchar(100) not null,\n"
                + "estado_cidade char(2) not null,\n"
                + "primary key (id_cidade)\n"
                + ")"
        );

        try {
            setConexao(lisaConnection.getConnection());
            setPstm(getConexao().prepareStatement(getSql()));

            setRs(getPstm().executeQuery());
            if (getRs() != null) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException e) {
            System.out.println("Erro ao criar tabela Cidade: " + e.getMessage());
            return false;
        } finally {
            lisaConnection.closeConnection(getConexao(), getPstm(), getRs());
        }
    }

    public boolean createTableBairro() {
        setSql(
                "create table tb_bairro(\n"
                + "id_bairro integer not null,\n"
                + "nome_bairro varchar(50) not null,\n"
                + "constraint pk_bairro \n"
                + "primary key(id_bairro)\n"
                + ")"
        );

        try {
            setConexao(lisaConnection.getConnection());
            setPstm(getConexao().prepareStatement(getSql()));

            setRs(getPstm().executeQuery());
            if (getRs() != null) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException e) {
            System.out.println("Erro ao criar tabela Bairro: " + e.getMessage());
            return false;
        } finally {
            lisaConnection.closeConnection(getConexao(), getPstm(), getRs());
        }
    }

    public boolean createTableCliente() {
        setSql(
                "create table tb_cliente(\n"
                + "id_cliente integer not null,\n"
                + "nome_cliente varchar(50) not null,\n"
                + "sobrenome_cliente varchar(50) not null,\n"
                + "nascimento_cliente varchar(4) null,\n"
                + "telefone_cliente varchar(50) null,\n"
                + "email_cliente varchar(100) null,\n"
                + "rg_cliente varchar(50) not null unique,\n"
                + "cpf_cliente varchar(50) not null unique,\n"
                + "logradouro_cliente varchar(100) not null,\n"
                + "numero_endereco_cliente integer null,\n"
                + "bairro_cliente integer not null,\n"
                + "cidade_cliente integer not null,"
                + "constraint pk_cliente \n"
                + "primary key(id_cliente),\n"
                + "constraint fk_bairro_cliente foreign key(bairro_cliente)\n"
                + "references tb_bairro(id_bairro),\n"
                + "constraint fk_cidade_cliente foreign key(cidade_cliente)\n"
                + "references tb_cidade(id_cidade)\n"
                + ")"
        );

        try {
            setConexao(lisaConnection.getConnection());
            setPstm(getConexao().prepareStatement(getSql()));

            setRs(getPstm().executeQuery());
            if (getRs() != null) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException e) {
            System.out.println("Erro ao criar tabela Cliente: " + e.getMessage());
            return false;
        } finally {
            lisaConnection.closeConnection(getConexao(), getPstm(), getRs());
        }
    }

    public boolean createTableOs() {
        setSql(
                "create table tb_os(\n"
                + "id_os integer not null,\n"
                + "usuario_os varchar(100) not null,\n"
                + "cliente_os integer not null,\n"
                + "profissional_os integer not null,\n"
                + "data_entrada_os varchar(10) not null,\n"
                + "equipamento_os varchar(50) not null,\n"
                + "defeito_os varchar(200),\n"
                + "data_saida_os varchar(10),\n"
                + "valor_os numeric(5,2),\n"
                + "servico_os varchar(50),\n"
                + "situacao_os varchar(100) null,"
                + "constraint pk_os \n"
                + "primary key(id_os),\n"
                + "constraint fk_cliente_os foreign key(cliente_os)\n"
                + "references tb_cliente(id_cliente),\n"
                + "constraint fk_profissional_os foreign key(profissional_os)\n"
                + "references tb_profissional(id_profissional)\n"
                + ")"
        );

        try {
            setConexao(lisaConnection.getConnection());
            setPstm(getConexao().prepareStatement(getSql()));

            setRs(getPstm().executeQuery());
            if (getRs() != null) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException e) {
            System.out.println("Erro ao criar tabela Ordem de serviço: " + e.getMessage());
            return false;
        } finally {
            lisaConnection.closeConnection(getConexao(), getPstm(), getRs());
        }
    }

    private void createUsuAdm() {
        setSql("insert into tb_usuario values (1, 'Administrador', 'Adm', 'admin', 'admin')");

        try {
            setConexao(lisaConnection.getConnection());
            setPstm(getConexao().prepareStatement(getSql()));

            getPstm().executeQuery();

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao criar usuário administrador: " + e.getMessage());
        } finally {
            lisaConnection.closeConnection(getConexao(), getPstm());
        }

    }
    
    public void createView(){
        createViewBairro();
        createViewCidade();
        createViewCliente();
        createViewOrdemServico();
        createViewProfissional();
        createViewUsuario();
        createViewValorTotal();
    }
      

    private void createViewBairro() {
        setSql("create view vBairro as select id_bairro ID, nome_bairro Bairro from tb_bairro");
        setConexao(lisaConnection.getConnection());

        try {
            setPstm(getConexao().prepareStatement(getSql()));
            setRs(getPstm().executeQuery());
            getPstm().executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void createViewCidade() {

        setSql("create view vCidade as select id_cidade ID, nome_cidade Cidade, estado_cidade Estado from tb_cidade");
        setConexao(lisaConnection.getConnection());

        try {
            setPstm(getConexao().prepareStatement(getSql()));
            setRs(getPstm().executeQuery());
            getPstm().executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void createViewCliente() {

        setSql(
                "create view vCliente as select C.id_cliente ID, C.nome_cliente Nome, C.sobrenome_cliente SOBRENOME,"
                + " C.nascimento_cliente NASC, C.cpf_cliente CPF, C.rg_cliente RG,"
                + "C.telefone_cliente TEL, C.email_cliente EMAIL, C.logradouro_cliente ENDEREÇO,"
                + "C.numero_endereco_cliente Nº, B.nome_bairro BAIRRO, Cid.nome_cidade CIDADE "
                + "from tb_cliente C, tb_bairro B, tb_cidade Cid where C.bairro_cliente = B.id_bairro and C.cidade_cliente = Cid.id_cidade"
        );

        setConexao(lisaConnection.getConnection());

        try {
            setPstm(getConexao().prepareStatement(getSql()));
            setRs(getPstm().executeQuery());
            getPstm().executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void createViewOrdemServico() {
        setSql(
                "create view vOrdemServico as select Os.id_os OS, Os.usuario_os ATENDENTE, P.nome_profissional PROFISSIONAL,"
                + " C.nome_cliente || ' ' || C.sobrenome_cliente CLIENTE, "
                + "C.cpf_cliente CPF, Os.equipamento_os EQUIPAMENTO, Os.servico_os SERVIÇO, Os.valor_os VALOR, "
                + "Os.data_entrada_os ENTRADA, Os.data_saida_os SAÍDA, Os.situacao_os SITUAÇÃO, Os.defeito_os DEFEITO "
                + "from tb_os Os, tb_profissional P, tb_cliente C "
                + "where Os.profissional_os = P.id_profissional and Os.cliente_os = C.id_cliente"
        );

        setConexao(lisaConnection.getConnection());

        try {
            setPstm(getConexao().prepareStatement(getSql()));
            setRs(getPstm().executeQuery());
            getPstm().executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    private void createViewProfissional() {

        setSql("create view vProfissional as select id_profissional Id, nome_profissional Nome, sobrenome_profissional Sobrenome from tb_profissional");

        setConexao(lisaConnection.getConnection());

        try {
            setPstm(getConexao().prepareStatement(getSql()));
            setRs(getPstm().executeQuery());
            getPstm().executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void createViewUsuario() {
        setSql(
            "create view vUsuario as select id_usuario Id, nome_usuario Nome, sobrenome_usuario Sobrenome,"
          + "login_usuario Login, senha_usuario Senha from tb_usuario"
        );

        setConexao(lisaConnection.getConnection());

        try {
            setPstm(getConexao().prepareStatement(getSql()));
            setRs(getPstm().executeQuery());
            getPstm().executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private void createViewValorTotal() {
        setSql("create view valorTotal as select situacao_os as Situacao, "
             + "data_saida_os as Entrega, sum(valor_os) as Valor from tb_os group by (situacao_os, data_saida_os)");
        setConexao(lisaConnection.getConnection());

        try {
            setPstm(getConexao().prepareStatement(getSql()));
            setRs(getPstm().executeQuery());
            getPstm().executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
