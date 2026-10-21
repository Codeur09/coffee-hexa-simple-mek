package org.formation.coffee.domain.exception;

public class CoffeeNotFoundException extends DomainException {

    private final long coffeeId;

    public CoffeeNotFoundException(long coffeeId) {
        super("Coffee %d not found".formatted(coffeeId));
        this.coffeeId = coffeeId;
    }

    public long getCoffeeId() {
        return coffeeId;
    }
}
