import sys, os
current_dir = os.path.abspath(os.path.dirname(__file__))
parent_dir = os.path.abspath(os.path.join(current_dir, ".."))
grandparent_dir = os.path.abspath(os.path.join(current_dir, "..", ".."))
sys.path.append(parent_dir)
sys.path.append(grandparent_dir)
from models.Course import Course
from models.Employee import Employee
from service.CommandI import CommandI
from models.Command import Command
from exceptions.InvalidInputError import InvalidInputError

class AllotCourseCommand(CommandI):

    def execute(self,courses:dict,regCourseMap:dict, c:Command):
        courseId = c.commandParams[0]
        course:Course = courses.get(courseId)
        if course is not None:
            if len(course.registeredEmployees)<int(course.minCapacity):
                course.isCancelled = True;
                self.printCourse(course)
            else:
                course.isAllotted = True
                self.printCourse(course)
        else:
            raise InvalidInputError("INPUT_DATA_ERROR")

    def printCourse(self,course:Course):
        status = "COURSE_CANCELLED" if course.isCancelled else "CONFIRMED";
        for k,v in course.registeredEmployees.items():
            d = course.date.strftime("%d%m%Y")
            regId:str = k
            emp :Employee = v
            print(regId," "+emp.email," ",course.courseID," ",course.courseName," ",course.instructor," ",d," ",status)

