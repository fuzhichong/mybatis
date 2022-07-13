package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: chong
 * @Date: 2022/7/12 18:13
 * @DESC
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Grade {
    //年级编号
    private int gradeID;
    //年纪名称
    private String gradeName;
}
