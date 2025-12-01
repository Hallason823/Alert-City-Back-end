package com.example.Alert_City.dto;

import java.time.LocalDateTime;

import com.example.Alert_City.enums.ProfileType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CommentDTO {
    private Long id;
    private String text;
    private LocalDateTime postedAt;
    private Long userId;
    private String userName;
    private ProfileType userProfileType;
    private Long occurrenceId;
}
