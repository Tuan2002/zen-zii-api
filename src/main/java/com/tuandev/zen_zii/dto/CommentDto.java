package com.tuandev.zen_zii.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentDto {
    public Integer postId;
    public Integer commenterId;
    public String commentContent;
    public String commentTimestamp;
    public String commenterName;
    public String commenterAvatar;
}
