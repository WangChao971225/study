package com.wangchao.iocxml.dimap;

import java.util.List;
import java.util.Map;

/**
 * @author Wang Chao
 * @create 2023/2/8 21:23
 */
public class Student {

    private Integer studentId;
    private String studentName;
    private Map<String, Teacher> teacherMap;
    private List<Lesson> lessonList;

    public void info() {
        System.out.println("学生编号：" + studentId + ", 学生名字：" + studentName);
        System.out.println(teacherMap);
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Map<String, Teacher> getTeacherMap() {
        return teacherMap;
    }

    public void setTeacherMap(Map<String, Teacher> teacherMap) {
        this.teacherMap = teacherMap;
    }

    public List<Lesson> getLessonList() {
        return lessonList;
    }

    public void setLessonList(List<Lesson> lessonList) {
        this.lessonList = lessonList;
    }
}
