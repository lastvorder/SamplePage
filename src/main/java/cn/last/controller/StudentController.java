package cn.last.controller;

import cn.last.entity.StudentDto;
import cn.last.service.StudentService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author chenzihao
 */
@Controller
public class StudentController {
    @Autowired
    public StudentController(StudentService service) {
        this.service = service;
    }

    private final StudentService service;

    @RequestMapping(value = "students")
    @ResponseBody
    public PageInfo<StudentDto> listStudent(int pageNum, int pageSize) {
        return service.listStudent(pageNum, pageSize);
    }
}
