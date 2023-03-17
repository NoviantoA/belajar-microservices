package novianto.anggoro.product.service.repository;

import novianto.anggoro.product.service.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
