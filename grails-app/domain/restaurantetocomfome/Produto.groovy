package restaurantetocomfome

class Produto {

    String nome
    Double preco

    // Classe estoque - OneToOne
    static hasOne = [ estoque: Estoque ]

    static hasMany = [ clientes: Cliente, itens: ItemPedido ]

    // pertence a
    static belongsTo = [ Cliente ]

    static constraints = {
    }

    // alterando propriedades da tabela no banco
    static mapping = {
        estoque column: "estoque_id"
        clientes joinTable: [ name: "preferencias_clientes", key: "produto_id", column: "cliente_id" ]
    }
}