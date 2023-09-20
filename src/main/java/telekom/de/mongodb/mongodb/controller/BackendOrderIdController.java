package telekom.de.mongodb.mongodb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import telekom.de.mongodb.mongodb.domain.BackendOrderId;
import telekom.de.mongodb.mongodb.service.BackendOrderIdService;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class BackendOrderIdController {

    @Autowired
    private BackendOrderIdService backendOrderIdService;

    @PostMapping("/create")
    public ResponseEntity<BackendOrderId> createOrder(@RequestBody BackendOrderId order) {
        BackendOrderId result = backendOrderIdService.saveOrder(order);
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }

    @GetMapping("/get-by-bTyp")
    public ResponseEntity<List<BackendOrderId>> getOrdersByBackendType(@RequestParam String backendType) {
        List<BackendOrderId> orders = backendOrderIdService.getOrdersByBackendType(backendType);
        return new ResponseEntity<>(orders, HttpStatus.OK);
    }

    @GetMapping("/get-all-document")
    public ResponseEntity<List<BackendOrderId>> getAllBOI(){
        return new ResponseEntity<>(backendOrderIdService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/get-all-document-by-all-id")
    public ResponseEntity<List<BackendOrderId>> getAllBOIbyIds(String order_id, String public_id, String external_id){
        return new ResponseEntity<>(backendOrderIdService.getOrdersByAllId(order_id, public_id, external_id), HttpStatus.OK);
    }
}
