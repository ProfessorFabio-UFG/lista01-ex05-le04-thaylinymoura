import java.util.ArrayList;

public class Apartamento extends Moradores{

    private int numero;
    private int andar;
    private double metragem;
    private String situacao; // Ex: "Alugado", "Financiado", "Quitado"

    // Metodo de Associacao
    private ArrayList<Moradores> moradores;

    public Apartamento( int numero, int andar, double metragem, String situacao) {

        this.numero = numero;
        this.andar = andar;
        this.metragem = metragem;
        this.situacao = situacao;
        this.moradores = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public double getMetragem() {
        return metragem;
    }

    public void setMetragem(double metragem) {
        this.metragem = metragem;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public ArrayList<Moradores> getMoradores() {
        return moradores;
    }

    // Adicionar morador ao apartamento
    public void adicionarMorador(Moradores morador) {
        moradores.add(morador);
    }

    public void exibirApartamento() {
        System.out.println("==== Apartamento " + numero + " ====");
        System.out.println("Andar: " + andar);
        System.out.println("Metragem: " + metragem + " m²");
        System.out.println("Situação: " + situacao);
        System.out.println("---- Moradores ----");
        if (moradores.isEmpty()) {
            System.out.println("Sem moradores cadastrados.");
        } else {
            for (Moradores m : moradores) {
                m.moradoresCadastrados();
            }
        }
        System.out.println("==============================\n");
    }


}
