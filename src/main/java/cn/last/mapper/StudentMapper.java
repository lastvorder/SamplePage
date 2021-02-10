package cn.last.mapper;

import cn.last.entity.StudentDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author chenzihao
 */
@Mapper
public interface StudentMapper {
    /**
     * 查询学生列表
     * @return 结果
     */
    @Select("SELECT * FROM student")
    List<StudentDto> listStudent();
}
