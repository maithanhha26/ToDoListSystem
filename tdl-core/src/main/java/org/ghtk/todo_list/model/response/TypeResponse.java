package org.ghtk.todo_list.model.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
public class TypeResponse {
  private String id;
  private String title;
  private String image;
  private String description;
}
