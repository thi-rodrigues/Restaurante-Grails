package restaurantetocomfome

class Cliente {

    String nome
    String email
    String senha

    static hasMany = [pedidos: Pedido, produtosPreferidos: Produto]

    static constraints = {
    }

    // alterando propriedades da tabela no banco
    static mapping  = {
        produtosPreferidos joinTable: [name: "preferencias_clientes", key: "cliente_id", column: "produto_id"]
    }
}
