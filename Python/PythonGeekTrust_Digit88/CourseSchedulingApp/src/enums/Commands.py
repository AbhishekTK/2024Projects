from enum import Enum
class Commands(Enum):

    ADD_COURSE_OFFERING = (1, 5)
    CANCEL = (2,1)
    REGISTER =(3,2)
    ALLOT = (4,1)

    def __init__(self, code:int, attr:int) -> None:
        self.code = code
        self.attr= attr
    
    # def __init__(self, attr) -> None:
    #     self.attr = attr;

    def getattribute(self) -> any:
        return self.attr
    