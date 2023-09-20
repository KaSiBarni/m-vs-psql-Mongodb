package telekom.de.mongodb.mongodb.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "backend_order_id")
public class BackendOrderId {

    private String productOrderId;
    private String publicIdentifier;
    private String externalId;
    private List<BackendOrderIdData> backendOrderIdData;

    @Override
    public String toString() {
        return super.toString();
    }
}
