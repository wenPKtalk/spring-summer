package com.topsion.summer.domain.entity.repository.product;

import lombok.Getter;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Getter
public class ProjectId implements Serializable {
    private Long Id;
}
