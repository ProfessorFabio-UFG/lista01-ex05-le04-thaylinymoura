public class Moradores {


    //nome, cpf,celular, data de nascimento, sexo, bloco, apartamento e código de acesso

    private String nome;
    private String cpf;
    private String celular;
    private String dataNascimento;
    private String sexo;
    private String bloco;
    private String apartamento;
    String codigoAcesso;

    public  Moradores(){

    }

    public Moradores(String nome, String cpf, String dataNascimento, String celular, String sexo, String bloco, String apartamento, String codigoAcesso) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.celular = celular;
        this.sexo = sexo;
        this.bloco = bloco;
        this.apartamento = apartamento;
        this.codigoAcesso = codigoAcesso;
    }

    public void moradoresCadastrados(){
        System.out.println("----- Morador Cadastrado -----");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Celular: " + celular);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Sexo: " + sexo);
        System.out.println("Bloco: " + bloco);
        System.out.println("Apartamento: " + apartamento);
        System.out.println("Código de Acesso: " + codigoAcesso);
        System.out.println("-------------------------------\n");
    }
}
