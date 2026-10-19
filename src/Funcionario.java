public class Funcionario extends Pessoa {

    private int idFunc;
    private int salario;

    public Funcionario(String nome, int idade, String cpf, int idFunc, int salario) {
        super(nome, idade, cpf);
        this.idFunc = idFunc;
        this.salario = salario;
    }

    public int getIdFunc() {
        return idFunc;
    }

    public void setIdFunc(int idFunc) {
        this.idFunc = idFunc;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void RemoverCliente() {
        // Lógica de remover cliente
    }


    public void AdicionarCliente() {
        // Lógica de adicionar cliente
    }


    public void AtualizarCliente() {
        // Lógica de atualizar cliente
    }


    public void ConsultarCliente() {
        // Lógica de consultar cliente
    }


    public void ConsultarConta() {
        // Lógica de consultar conta
    }    


    public void AtualizaCadastro() {
        // Lógica de atualizar cadastro
    }

}