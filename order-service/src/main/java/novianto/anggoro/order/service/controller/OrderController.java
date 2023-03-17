package novianto.anggoro.order.service.controller;

import lombok.RequiredArgsConstructor;
import novianto.anggoro.order.service.dto.OrderRequest;
import novianto.anggoro.order.service.service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/order")
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String placeOrder(@RequestBody OrderRequest orderRequest){
        orderService.placeOrder(orderRequest);
        return "Order Place Successfully";
    }
}
