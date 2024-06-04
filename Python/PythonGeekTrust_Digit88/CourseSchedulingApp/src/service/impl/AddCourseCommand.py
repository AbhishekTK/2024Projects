from datetime import datetime
import sys, os
from typing import List

from service.CommandI import CommandI

current_dir = os.path.abspath(os.path.dirname(__file__))
parent_dir = os.path.abspath(os.path.join(current_dir, ".."))
grandparent_dir = os.path.abspath(os.path.join(current_dir, "..", ".."))
sys.path.append(parent_dir)
sys.path.append(grandparent_dir)
from models.Course import Course
from models.Command import Command
from exceptions.InvalidInputError import InvalidInputError

class AddCourseCommand(CommandI):
    def execute(self,courses:dict,regCourseMap:dict, c:Command):
        course :Course = self.generateCourse(c.commandParams)
        courses.setdefault(course.courseID,course);
        print(course.courseID)

    def generateCourse(self,params:List[str])-> Course:
        c = None;
        try: 
            cName = params[0]
            cIns = params[1]
            date_string = params[2]
            d = datetime.strptime(date_string, "%d%m%Y")
            minC = params[3]
            maxC = params[4]
            c = Course("OFFERING-"+cName+"-"+cIns.strip(),cName.strip(),cIns,d,minC, maxC,False,False)
        except Exception as e:
            raise InvalidInputError("INVALID_INPUT")
        return c;