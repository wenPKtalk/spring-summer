package com.topsion.summer.repository.product.entity;

import lombok.Getter;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Getter
public class ProjectId implements Serializable {
    private Long Id;
}
