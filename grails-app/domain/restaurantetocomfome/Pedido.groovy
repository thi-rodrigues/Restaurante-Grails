package restaurantetocomfome

class Pedido {

    Date dataHora
    Double valorTotal

    Cliente cliente

    static hasMany = [ itens: ItemPedido ]

    static constraints = {
    }

    static mapping = {
        cliente column: "cliente_id"
    }
}
