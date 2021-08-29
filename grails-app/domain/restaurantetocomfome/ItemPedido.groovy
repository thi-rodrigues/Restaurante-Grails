package restaurantetocomfome

class ItemPedido {

    Integer quantidade
    Double valorVenda
    String observacao

    Pedido pedido
    Produto produto

    static belongsTo = [ Pedido ]

    static constraints = {
    }
}
