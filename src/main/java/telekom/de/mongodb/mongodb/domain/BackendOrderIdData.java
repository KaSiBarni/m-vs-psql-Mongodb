package telekom.de.mongodb.mongodb.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BackendOrderIdData {
    private String orderItemId;
    private List<BackendData> backendOrderIds;
}
