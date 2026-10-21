package org.formation.coffee.domain.model;

import org.formation.coffee.domain.exception.DomainValidationException;

public record Review(ReviewId id, String author, String comment, int rating) {

    public Review {
        if (author == null || author.isBlank()) {
            throw new DomainValidationException("Review author must not be blank");
        }
        if (comment == null || comment.isBlank()) {
            throw new DomainValidationException("Review comment must not be blank");
        }
        if (rating < 1 || rating > 5) {
            throw new DomainValidationException(
                    "Review rating must be between 1 and 5, got %d".formatted(rating));
        }
    }
}
