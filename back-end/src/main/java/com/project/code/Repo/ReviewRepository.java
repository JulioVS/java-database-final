package com.project.code.Repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.project.code.Model.Review;

// This interface defines the repository for managing Review entities in a MongoDB database.
// Review is the only MongoDB entity in the project, so we use MongoRepository instead of JpaRepository.

public interface ReviewRepository extends MongoRepository<Review, String> {

    // 1. Add the repository interface:
    // - Extend MongoRepository<Review, String> to inherit basic CRUD functionality
    // for MongoDB operations.
    // - This allows the repository to perform operations like save, delete, update,
    // and find without having to implement these methods manually.

    // Example: public interface ReviewRepository extends MongoRepository<Review,
    // String> {}

    // 2. Add custom query methods:
    // - **findByStoreIdAndProductId**:
    // - This method will retrieve reviews for a specific product and store.
    // - Return type: List<Review>
    // - Parameters: Long storeId, Long productId

    // Example: public List<Review> findByStoreIdAndProductId(Long storeId, Long
    // productId);
    public List<Review> findByStoreIdAndProductId(Long storeId, Long productId);

}
