package restaurantetocomfome

class ItemPedido {

    Integer quantidade
    Double valorVenda
    String observacao

    Pedido pedido
    Produto produto

    static belongsTo = [ Pedido ]

    static constraints = {
        quantidadeMinima min: 0
        valorVenda min: new Double(0)
        observacao nullable: true, blank: true
    }
}
