import sys, os
# sys.path.append(r".\\") 
current_dir = os.path.abspath(os.path.dirname(__file__))
parent_dir = os.path.abspath(os.path.join(current_dir, ".."))
grandparent_dir = os.path.abspath(os.path.join(current_dir, "..", ".."))
sys.path.append(parent_dir)
sys.path.append(grandparent_dir)
from src.enums.Commands import Commands

from enum import Enum

def test_setup():
    registerAttr = 2
    courseOfferAttr = 5
    assert Commands.ADD_COURSE_OFFERING.attr == 5
    assert Commands.REGISTER.attr == 2
    
    

class CommandsTest:
    def test_setup():
        registerAttr = 2
        courseOfferAttr = 5
        assert Commands.ADD_COURSE_OFFERING.attr == 5
        assert Commands.REGISTER.attr == 2
        c = Commands.ADD_COURSE_OFFERING
        print(c.value)

if __name__ == "__main__":
    ct = CommandsTest;
    ct.test_setup();