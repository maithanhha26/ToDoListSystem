package org.ghtk.todo_list.paging;

import java.util.List;
import lombok.Data;
import org.springframework.data.domain.Page;

@Data
public class PageRes<T> {

    private List<T> pageData;
    private int pageNo;
    private int pageSize;
    private long total;

    protected PageRes(Page<T> page) {
        this.pageData = page.getContent();
        this.total = page.getTotalElements();
        this.pageNo = page.getNumber()+1;
        this.pageSize = page.getSize();
    }

    public static <H> PageRes<H> of(Page<H> page) {
        return new PageRes<>(page);
    }

}
