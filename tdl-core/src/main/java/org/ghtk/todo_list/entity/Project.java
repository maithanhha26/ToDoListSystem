package org.ghtk.todo_list.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.ghtk.todo_list.entity.base.BaseEntity;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Data
@Table(name = "project")
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class Project extends BaseEntity {

  private String title;
  private String keyProject;
  private Integer counterTask;
}