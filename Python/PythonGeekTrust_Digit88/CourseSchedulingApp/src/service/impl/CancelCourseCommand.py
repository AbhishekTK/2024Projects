import sys, os
current_dir = os.path.abspath(os.path.dirname(__file__))
parent_dir = os.path.abspath(os.path.join(current_dir, ".."))
grandparent_dir = os.path.abspath(os.path.join(current_dir, "..", ".."))
sys.path.append(parent_dir)
sys.path.append(grandparent_dir)
from models.Course import Course
from service.CommandI import CommandI
from models.Command import Command
from constants.Constants import Constants

class CancelCourseCommand(CommandI):
    def execute(self,courses:dict,regCourseMap:dict, c:Command):
        regId = c.commandParams[0]
        if self.isValidRegId(regId,regCourseMap):
            if self.isCourseNotAlloted(regId,regCourseMap):
                print(regId," ",Constants.CANCEL_REJECTED)
            else:
                self.removeRegEmp(regId,regCourseMap)
                print(regId," ",Constants.CANCEL_ACCEPTED)
        else:
            print(regId," ",Constants.CANCEL_REJECTED)
        
    
    def removeRegEmp(self,regId,regCourseMap:dict):
        c:Course = regCourseMap.get(regId)
        c.registeredEmployees.pop(regId)
        regCourseMap.pop(regId)

    def isCourseNotAlloted(self,regId,regCourseMap:dict):
        return regCourseMap.get(regId).isAllotted

    def isValidRegId(self,regId,regCourseMap):
        if regId in regCourseMap:
            return True;
        else:
            False