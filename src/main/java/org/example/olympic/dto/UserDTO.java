package org.example.olympic.dto;

import lombok.Data;
import org.example.olympic.domain.Subject;

import java.util.Set;

@Data
public class UserDTO {
   private String userId;
   private String password;
   private String nickname;
   private String profileImage;
   private Set<Subject> subjects;
}