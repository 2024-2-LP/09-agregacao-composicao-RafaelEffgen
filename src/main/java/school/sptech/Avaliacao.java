package school.sptech;

public class Avaliacao {
    private String descricao;
    private Double qtdEstrelas;

    @Override
    public String toString() {
        return """
                A descricao do livro é: %s
                e a quantidade de estrelas é: %.2f
                """.formatted(descricao, qtdEstrelas);
    }

    public Avaliacao() {
    }

    public Avaliacao(String descricao, Double qtdEstrelas) {
        this.descricao = descricao;
        this.qtdEstrelas = qtdEstrelas;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getQtdEstrelas() {
        return qtdEstrelas;
    }

    public void setQtdEstrelas(Double qtdEstrelas) {
        this.qtdEstrelas = qtdEstrelas;
    }
}
