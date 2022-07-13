package mapper;

import entity.Grade;

import java.util.List;

/**
 * @Author: chong
 * @Date: 2022/7/12 18:16
 * @DESC
 */
public interface GradeMapper {
    //查询表中记录条数
    int findCount();
    //查询表中所有记录
    List<Grade> findAll();
    //根据id查询年级名称
    String findGradeNameById(int id);
    // 新增一条记录,并返回年级id
    int addGrade(Grade grade);
    //修改年级名称
    int updateGradeNameById(Grade grade);
    //删除id为1的年级信息
    int deleteGradeById(int id);
}
