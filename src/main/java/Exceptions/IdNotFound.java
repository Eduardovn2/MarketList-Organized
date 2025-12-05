package Exceptions;

public class IdNotFound extends RuntimeException{
    public IdNotFound(Long id){
        super("O ID '"+id+ "' nao foi encontrado na lista de compras.");
    }
}
