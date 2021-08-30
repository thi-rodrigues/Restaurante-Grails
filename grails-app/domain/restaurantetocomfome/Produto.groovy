package restaurantetocomfome

class Produto {

    String nome
    Double preco

    Estoque estoque;

    static hasMany = [ clientes: Cliente, itens: ItemPedido ]

    // pertence a
    static belongsTo = [ Cliente ]

    static constraints = {
        nome nullable: false, blank: false
        preco min: new Double(0)
    }

    // alterando propriedades da tabela no banco
    static mapping = {
        tablePerHierarchy false
        discriminator column: "tipo", value: "GERAL"
        estoque column: "estoque_id"
        clientes joinTable: [ name: "preferencias_clientes", key: "produto_id", column: "cliente_id" ]
    }
}