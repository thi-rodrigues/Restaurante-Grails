package restaurantetocomfome

class Estoque {

    Integer quantidade
    Integer quantidadeMinima

    // Classe produto - OneToOne
    Produto produto

    static constraints = {
    }
}
