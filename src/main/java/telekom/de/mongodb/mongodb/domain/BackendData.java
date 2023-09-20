package telekom.de.mongodb.mongodb.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BackendData {

    private String id;
    private String orderItemId;
    private String backendName;
    private String backendType;
    @NonNull
    private String backendOrderId;
    private String name;
    private String description;

}
