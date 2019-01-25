package com.ids.secstar.model.fds;

import com.ids.secstar.model.annotations.DescribedBy;
import com.ids.secstar.model.annotations.SecAnnotated;

/**
 * Created by Xinlu on 2018/12/19.
 */

@SecAnnotated
@DescribedBy("Header")
public class Header extends Namelist {
    @DescribedBy("字符ID，用于标记输出文件")
    private String chid = "output"; //CHID

    @DescribedBy("描述模拟内容")
    private String title; //TITLE


}
