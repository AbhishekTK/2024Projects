import sys, os

current_dir = os.path.abspath(os.path.dirname(__file__))
parent_dir = os.path.abspath(os.path.join(current_dir, ".."))
grandparent_dir = os.path.abspath(os.path.join(current_dir, "..", ".."))
sys.path.append(parent_dir)
sys.path.append(grandparent_dir)
from exceptions.CourseFullError import CourseFullError
from models.Course import Course
from models.Employee import Employee
from service.CommandI import CommandI
from models.Command import Command
from constants.Constants import Constants

class RegisterCourseCommand(CommandI):
    def execute(self,courses:dict,regCourseMap:dict, c:Command):
        courseId = c.commandParams[1]
        e:Employee = self.genEmp(c)
        if courseId in courses:
            course:Course = courses.get(courseId)
            if not course.isAllotted or not course.isCancelled:
                if len(course.registeredEmployees) == course.maxCapacity:
                    raise CourseFullError("COURSE_FULL_ERROR")
                else:
                    self.register(e,course,regCourseMap)
            else:
                print("REG_COURSE-",e.name,"-",course.courseName.strip()," ",Constants.REJECTED)
        else:
            print("INPUT_DATA_ERROR")
    
    def register(self,e,course:Course,regCourseMap:dict):
        regId = course.addEmp(e)
        regCourseMap.setdefault(regId.strip(),course)
        print(regId.strip()," ",Constants.ACCEPTED.strip())


    def genEmp(self,c:Command):
        return Employee(c.commandParams[0])


