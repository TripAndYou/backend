package com.example.sprint4.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass //Entity가 자동으로 컬럼으로 인식
@EntityListeners(AuditingEntityListener.class) //생성된 시간을 자동으로 업데이트
public abstract class Timestamped { //추상클래스

    @CreatedDate
    private LocalDateTime writeDate;
}
