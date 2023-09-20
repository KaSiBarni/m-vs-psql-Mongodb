package telekom.de.mongodb.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import telekom.de.mongodb.mongodb.domain.BackendOrderId;

import java.util.List;

@Repository
public interface BackendOrderIdRepository extends MongoRepository<BackendOrderId, String> {

    //List<BackendOrderId> findByBackendOrderIdDataBackendType(String backendType);
    List<BackendOrderId> findByBackendOrderIdDataBackendOrderIdsBackendType (String backendType);

    List<BackendOrderId> findByProductOrderIdOrPublicIdentifierOrExternalId(String order_id, String public_id, String external_id);
}
