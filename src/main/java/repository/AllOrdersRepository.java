
package osemes.javapro.dz28.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import osemes.javapro.dz28.model.Order;

import java.util.List;

public interface AllOrdersRepository extends JpaRepository<Order, Long> {
    // Отримання всіх замовлень
    List<Order> findAll();
}
