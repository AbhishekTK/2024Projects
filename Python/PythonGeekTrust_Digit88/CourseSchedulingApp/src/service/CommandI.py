from abc import ABC, abstractmethod

from models.Command import Command

# Define the command interface
class CommandI(ABC):
    @abstractmethod
    def execute(self,courses:dict,regCourseMap:dict, c:Command ):
        pass
