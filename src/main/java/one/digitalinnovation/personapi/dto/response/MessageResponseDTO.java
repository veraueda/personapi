package one.digitalinnovation.personapi.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
//Enable a Response Message
public class MessageResponseDTO {

    private String message;

}
