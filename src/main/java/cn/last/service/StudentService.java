package cn.last.service;

import cn.last.entity.StudentDto;
import com.github.pagehelper.PageInfo;

/**
 * @author chenzihao
 */
public interface StudentService {
    /**
     * 查询学生列表
     * @return 结果
     */
    PageInfo<StudentDto> listStudent(int pageNum ,int pageSize);
}
