public class Cliente extends Pessoa {

        private String tipoConta;
        private double saldo;
        private String numeroConta;
        private String agencia;
        private String senha;
        private String dataAbertura;
        private String dataFechamento;
        private String statusConta;
        private String limiteCredito;
        private String historicoTransacoes;
        private String extrato;

    public String getTipoConta() {
        return this.tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return this.numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getAgencia() {
        return this.agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getDataAbertura() {
        return this.dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public String getDataFechamento() {
        return this.dataFechamento;
    }

    public void setDataFechamento(String dataFechamento) {
        this.dataFechamento = dataFechamento;
    }

    public String getStatusConta() {
        return this.statusConta;
    }

    public void setStatusConta(String statusConta) {
        this.statusConta = statusConta;
    }

    public String getLimiteCredito() {
        return this.limiteCredito;
    }

    public void setLimiteCredito(String limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public String getHistoricoTransacoes() {
        return this.historicoTransacoes;
    }

    public void setHistoricoTransacoes(String historicoTransacoes) {
        this.historicoTransacoes = historicoTransacoes;
    }

    public String getExtrato() {
        return this.extrato;
    }

    public void setExtrato(String extrato) {
        this.extrato = extrato;
    }


    public Cliente(String nome, int idade, String cpf) {
        super(nome, idade, cpf);
    }

    public void FazerSaque() {
        // Lógica de saque
    }

    public void FecharConta() {
        // Lógica de fechar conta
    }

    public void TransferirCapital() {
        // Lógica de transferência
    }

    public void ExibirSaldo() {
        // Lógica de exibir saldo
    }

    public void ConsultarExtrato() {
        // Lógica de consultar extrato
    }


    public void ImprimirExtrato() {
        // Lógica de imprimir extrato
    }

    

}