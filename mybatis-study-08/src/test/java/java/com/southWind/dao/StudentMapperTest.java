package java.com.southWind.dao;

import com.southWind.dao.StudentMapper;
import com.southWind.pojo.Student;
import com.southWind.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static org.junit.Assert.*;

public class StudentMapperTest {

    @org.junit.Test
    public void getStudent2() {
        final SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> student2 = mapper.getStudent2();
        for (Student student : student2) {
            System.out.println(student);

        }

        sqlSession.close();
        
    }
}