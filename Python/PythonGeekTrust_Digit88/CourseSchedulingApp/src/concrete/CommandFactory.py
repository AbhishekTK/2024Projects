import sys,os

current_dir = os.path.abspath(os.path.dirname(__file__))
parent_dir = os.path.abspath(os.path.join(current_dir, ".."))
grandparent_dir = os.path.abspath(os.path.join(current_dir, "..", ".."))
sys.path.append(parent_dir)
sys.path.append(grandparent_dir)

from service.impl.CancelCourseCommand import CancelCourseCommand
from service.impl.RegisterCourseCommand import RegisterCourseCommand
from service.impl.AllotCourseCommand import AllotCourseCommand
from service.impl.AddCourseCommand import AddCourseCommand

class CommandFactory:
    @staticmethod
    def create_command(command_type):
        if command_type == "ADD_COURSE_OFFERING":
            return AddCourseCommand()
        elif command_type == "REGISTER":
            return RegisterCourseCommand()
        elif command_type == "CANCEL":
            return CancelCourseCommand()
        elif command_type == "ALLOT":
            return AllotCourseCommand()
        else:
            raise ValueError("Invalid command type")