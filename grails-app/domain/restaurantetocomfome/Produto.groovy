package restaurantetocomfome

class Produto {

    String nome
    Double proce

    // Classe estoque - OneToOne
    Estoque estoque
    
    static constraints = {
    }
}
