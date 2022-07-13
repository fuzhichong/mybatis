package mapper;

import entity.Student;

import java.util.List;

/**
 * @Author: chong
 * @Date: 2022/7/12 20:34
 * @DESC
 */
public interface StudentMapper {
     List<Student> selectStudent(Student student);
}
