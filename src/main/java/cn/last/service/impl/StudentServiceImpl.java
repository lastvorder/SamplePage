package cn.last.service.impl;

import cn.last.entity.StudentDto;
import cn.last.mapper.StudentMapper;
import cn.last.service.StudentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author chenzihao
 * @date 2021/01/25
 */
@Component
public class StudentServiceImpl implements StudentService {
    private final StudentMapper mapper;

    @Autowired
    public StudentServiceImpl(StudentMapper mapper){
        this.mapper = mapper;
    }

    @Override
    public PageInfo<StudentDto> listStudent(int pageNum ,int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<StudentDto> result = mapper.listStudent();
        PageInfo<StudentDto> info = new PageInfo<>(result);
        System.out.println(info.getList());
        return info;
    }
}
