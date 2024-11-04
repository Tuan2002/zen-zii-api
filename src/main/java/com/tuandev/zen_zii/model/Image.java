package com.tuandev.zen_zii.model;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Image {
    private Integer userId;
    private String userName;
    private String imageUrl;
    private String imageKey;
}
