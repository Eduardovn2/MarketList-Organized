package Exceptions;

public class NameNotFound extends RuntimeException{
    public NameNotFound(String name){
        super("O NOME '"+ name + "' nao foi encontrado na lista de compras.");
    }
}
