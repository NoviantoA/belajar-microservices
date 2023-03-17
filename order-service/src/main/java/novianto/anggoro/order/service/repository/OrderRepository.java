package novianto.anggoro.order.service.repository;

import novianto.anggoro.order.service.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
