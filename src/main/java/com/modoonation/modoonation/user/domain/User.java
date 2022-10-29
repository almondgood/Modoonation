package com.modoonation.modoonation.user.domain;

import com.modoonation.modoonation.user.domain.type.UserType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@EntityListeners(AuditingEntityListener.class)
public class User {

    @Id @GeneratedValue
    @Column(name = "user_id")
    private Long id;

    private String email;
    private String password;
    private String nickname;

    @Enumerated
    private UserType userType;

    private int reportCount;
    private boolean isPassedEmailAuth;
    private boolean isBanned;

    @CreatedDate
    private LocalDate createdAt;

    @LastModifiedDate
    private LocalDate lastModifiedAt;
}
