package dto;

import enums.MessageSubject;
import lombok.Data;

@Data
public class MessageDto {

    private MessageSubject subject;
    private String email;
    private String orderReference;
    private String message;
}
