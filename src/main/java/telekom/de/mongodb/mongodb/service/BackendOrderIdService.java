package telekom.de.mongodb.mongodb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import telekom.de.mongodb.mongodb.domain.BackendOrderId;
import telekom.de.mongodb.mongodb.repository.BackendOrderIdRepository;

import java.util.List;

@Service
public class BackendOrderIdService {

    @Autowired
    private BackendOrderIdRepository backendOrderIdRepository;

    public BackendOrderId saveOrder(BackendOrderId order) {
        return backendOrderIdRepository.save(order);
    }

    public List<BackendOrderId> getOrdersByBackendType(String backendType) {
        return backendOrderIdRepository.findByBackendOrderIdDataBackendOrderIdsBackendType(backendType);
    }

    public List<BackendOrderId> getOrdersByAllId(String order_id, String public_id, String external_id) {
        return backendOrderIdRepository.findByProductOrderIdOrPublicIdentifierOrExternalId(order_id, public_id, external_id);
    }

    public List<BackendOrderId> getAll(){
        return backendOrderIdRepository.findAll();
    }
}
