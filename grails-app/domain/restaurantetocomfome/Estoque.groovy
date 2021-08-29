package restaurantetocomfome

class Estoque {

    Integer quantidade
    Integer quantidadeMinima
    
    Produto produto

    static constraints = {
    }

    static mapping = {
       produto column: "produto_id"
       table name: "Estoque"
    }
}
