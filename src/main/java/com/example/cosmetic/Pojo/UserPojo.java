package com.example.cosmetic.Pojo;
import com.example.cosmetic.Entity.User;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserPojo {
    private Integer id;

    @NotEmpty(message = "email cannot be empty")
    private String email;
    @NotEmpty(message = "fullname cannot be empty")
    private  String fullname;
    @NotEmpty(message = "password cannot be empty")
    private  String password;



    public UserPojo(User user) {
        this.id=user.getId();
        this.email=user.getEmail();
        this.fullname=user.getFullname();
        this.password=user.getPassword();
    }
}
