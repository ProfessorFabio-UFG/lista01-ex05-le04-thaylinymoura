import java.util.Date;
public class Main {
    public static void main(String[] args) {
        // Criar um apartamento
        Apartamento ap1 = new Apartamento(101, 1, 75.5, "Quitado");

        // Criar moradores
        Moradores morador1 = new Moradores(
                "Ana Paula", "123.456.789-00", "(11) 91234-5678",
                "15/03/1985", "Feminino", "A", "101", "ANA12345"
        );

        Moradores morador2 = new Moradores(
                "João Mendes", "987.654.321-00", "(21) 99876-5432",
                "22/07/1990", "Masculino", "A", "101", "JOAO2024"
        );

        // Adicionar moradores ao apartamento
        ap1.adicionarMorador(morador1);
        ap1.adicionarMorador(morador2);

        // Exibir os dados do apartamento e seus moradores
        ap1.exibirApartamento();
    }
}
