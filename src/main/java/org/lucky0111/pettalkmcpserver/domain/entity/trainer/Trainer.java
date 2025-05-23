package org.lucky0111.pettalkmcpserver.domain.entity.trainer;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.lucky0111.pettalkmcpserver.domain.common.BaseTimeEntity;
import org.lucky0111.pettalkmcpserver.domain.entity.user.PetUser;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "trainers")
@NoArgsConstructor
public class Trainer extends BaseTimeEntity {
    @Id
    private UUID trainerId; // FK -> PetUser.userId

    @OneToOne
    @MapsId
    @JoinColumn(name = "trainer_id")
    private PetUser user;

    @Column(length = 1000)
    private String introduction;
    private Integer experienceYears;
    private LocalDateTime approvedAt;
}

