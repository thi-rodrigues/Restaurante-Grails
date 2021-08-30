package restaurantetocomfome

class Prato extends Produto {

    Integer quantidadePessoas

    static constraints = {
        quantidade min: 1
    }

    static mapping = {
        discriminator value: "PRATO"
    }
}
