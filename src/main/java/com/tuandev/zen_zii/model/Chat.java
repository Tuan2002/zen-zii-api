package com.tuandev.zen_zii.model;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Chat {
    Integer chatId;
    String sessionId;
    Integer userId;
    String chatContent;
    String chatTimestamp;
}
