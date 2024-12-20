package org.example.olympic.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
   private String userId;
   private String password;
   private String nickname;
   private String profileImage;
   private List<String> subjects;
   private List<StudyDTO> studies;
}