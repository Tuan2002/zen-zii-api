package com.tuandev.zen_zii.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class UpdatePostDto {
    public Integer postId;
    public String postCaption;
    public String postLocation;
    public String postAlt;
}
