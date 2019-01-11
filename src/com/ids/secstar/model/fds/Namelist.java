package com.ids.secstar.model.fds;

import com.ids.secstar.model.annotations.DescribedBy;
import com.ids.secstar.model.annotations.SecAnnotated;

/**
 * Created by Xinlu on 2018/12/19.
 */
@SecAnnotated
@DescribedBy("名称列表")
public class Namelist {
    @DescribedBy("For your information 注释")
    private String FYI;

    public String getFYI() {
        return FYI;
    }

    public void setFYI(String FYI) {
        this.FYI = FYI;
    }


}
