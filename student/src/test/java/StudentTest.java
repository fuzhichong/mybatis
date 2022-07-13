import entity.Student;
import mapper.StudentMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import utils.StudentUtil;

import java.util.List;

/**
 * @Author: chong
 * @Date: 2022/7/13 8:44
 * @DESC
 */
public class StudentTest {

    private SqlSession sqlSession;

    @Test
    public void selectStudent(){
        sqlSession = StudentUtil.getSqlSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        Student student = new Student();
        student.setName("张三");
        List<Student> list = studentMapper.selectStudent(student);
        // list.forEach(System.out::println);
        for (Student student1 : list){
            System.out.println(student1);
        }
    }
}
