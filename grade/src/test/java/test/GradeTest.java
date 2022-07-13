package test;

import entity.Grade;
import mapper.GradeMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import utils.GradeUtil;

import java.util.List;

/**
 * @Author: chong
 * @Date: 2022/7/12 18:37
 * @DESC
 */
public class GradeTest {
    private SqlSession sqlSession;

    /**
     * 查询数量
     */
    @Test
    public void findCount(){
        //获取sqlSession对象
        sqlSession = GradeUtil.getSqlSession();
        //getMapper执行sql
        GradeMapper gradeMapper = sqlSession.getMapper(GradeMapper.class);
        int count = gradeMapper.findCount();
        System.out.println(count);
        sqlSession.close();
    }

    /**
     * 查询表中所有记录
     */
    @Test
    public void findAll(){
        sqlSession = GradeUtil.getSqlSession();
        GradeMapper gradeMapper = sqlSession.getMapper(GradeMapper.class);
        List<Grade> list = gradeMapper.findAll();
        list.forEach(System.out::println);
        sqlSession.close();
    }

    /**
     * 根据id查询年级名称
     */
    @Test
    public void findGradeNameById(){
        sqlSession = GradeUtil.getSqlSession();
        GradeMapper gradeMapper = sqlSession.getMapper(GradeMapper.class);
        String name = gradeMapper.findGradeNameById(1);
        System.out.println(name);
        sqlSession.close();
    }

    /**
     * 新增一条记录,并返回年级id
     */
    @Test
    public void addGrade(){
        sqlSession = GradeUtil.getSqlSession();
        GradeMapper gradeMapper = sqlSession.getMapper(GradeMapper.class);
        Grade grade = new Grade();
        grade.setGradeID(1);
        grade.setGradeName("白云山");
        int i = gradeMapper.addGrade(grade);
        if(i>0){
            System.out.println(grade.getGradeID());
            sqlSession.commit();
        }sqlSession.close();
    }

    /**
     * 修改年级名称
     */
    @Test
    public void updateGradeNameById(){
        sqlSession = GradeUtil.getSqlSession();
        GradeMapper gradeMapper = sqlSession.getMapper(GradeMapper.class);
        Grade grade = new Grade();
        grade.setGradeID(1);
        grade.setGradeName("白云山plus");
        int i = gradeMapper.updateGradeNameById(grade);
        if(i>0){
            System.out.println("修改成功");
            sqlSession.commit();
        }sqlSession.close();
    }

    /**
     * 删除id为1的年级信息
     */
    @Test
    public void deleteGradeById(){
        sqlSession = GradeUtil.getSqlSession();
        GradeMapper gradeMapper = sqlSession.getMapper(GradeMapper.class);
        int i = gradeMapper.deleteGradeById(1);
        if(i>0){
            System.out.println("删除成功");
            sqlSession.commit();
        }sqlSession.close();
    }
}
