package restaurantetocomfome

class Cliente {

    String nome
    String email
    String senha
    String cpf

    static hasMany = [pedidos: Pedido, produtosPreferidos: Produto]

    static constraints = {
        nome nullable: false, blank: false
        email email: true, unique: true
        senha size: 6..10
        cpf validator: { valor, obj -> 
            (valor.size() == 11)
        }
    }

    // alterando propriedades da tabela no banco
    static mapping  = {
        produtosPreferidos joinTable: [name: "preferencias_clientes", key: "cliente_id", column: "produto_id"]
    }
}
