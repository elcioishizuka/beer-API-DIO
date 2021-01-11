package one.digitalinnovation.beerstock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerStockLessThanQuantityToDecrementException extends Exception {

    public BeerStockLessThanQuantityToDecrementException(Long id, int quantityToDecrement) {
        super(String.format("Beers with %s ID to decrement informed quantity to decrement exceeds the stock capacity: %s", id, quantityToDecrement));
    }
}




