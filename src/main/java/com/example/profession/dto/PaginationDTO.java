package com.example.profession.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zwz
 * @date : 2020/2/26 0026
 */
@Data
public class PaginationDTO<T> {
    private List<T> data;
    private boolean showPrevious;
    private boolean showFirstPage;
    private boolean showNext;
    private boolean showEndPage;
    private Integer page;
    private List<Integer> pages = new ArrayList<>();
     Integer totalPage;

    public void setPagination(Integer totalPage, Integer page) {

        this.totalPage = totalPage;
        this.page = page;
        pages.add(page);

        for (int i = 1; i <= 3; i++) {
            if (page - i > 0) {
                pages.add(0, page - i);
            }

            if (page + i <= totalPage) {
                pages.add(page + i);
            }
        }

         //展示上一页
         if (page == 1) {
             showPrevious = false;
         } else {
             showPrevious = true;
         }
        //展示下一页
         if (page == totalPage) {
             showNext = false;
         } else {
             showNext = true;
         }

        //展示第一页
        if (pages.contains(1)) {
            showFirstPage = false;
        } else {
            showFirstPage = true;
        }

        //展示最后一页
        if (pages.contains(totalPage)) {
            showEndPage = false;
        } else {
            showEndPage = true;
        }
    }
}
