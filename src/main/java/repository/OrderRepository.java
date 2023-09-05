// OrderRepository.java
package osemes.javapro.dz28.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import osemes.javapro.dz28.model.Order;

import java.util.Optional;

public interface OrderRepository extends JpaRepository<Order, Long> {
    // Пошук замовлення за ідентифікатором
    Optional<Order> findById(Long id);
}
