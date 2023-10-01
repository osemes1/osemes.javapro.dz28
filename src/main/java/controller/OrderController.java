package osemes.javapro.dz28.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import osemes.javapro.dz28.model.Order;
import osemes.javapro.dz28.repository.OrderRepository;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Controller
@Path("/orders")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class OrderController {
    private final OrderRepository orderRepository;

    @Autowired
    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @GET
    @Path("/{id}")
    public Order getOrderById(@PathParam("id") Long id) {
        return orderRepository.findById(id).orElse(null);
    }

    @GET
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @POST
    public void addOrder(Order order) {
        // Додаткова логіка для додавання замовлення
    }
}
