import sys, os

current_dir = os.path.abspath(os.path.dirname(__file__))
parent_dir = os.path.abspath(os.path.join(current_dir, ".."))
grandparent_dir = os.path.abspath(os.path.join(current_dir, "..", ".."))
sys.path.append(parent_dir)
sys.path.append(grandparent_dir)
from concrete.CommandFactory import CommandFactory
from models.Command import Command

class CourseAllocator:
    def __init__(self) -> None:
        self.courses:dict= {}
        self.regCourseMap:dict = {}

    def fulfillCommand(self,c:Command):
        command_factory = CommandFactory()
        presentCommand = command_factory.create_command(c.command.name)
        # print(presentCommand)
        presentCommand.execute(self.courses,self.regCourseMap,c)



