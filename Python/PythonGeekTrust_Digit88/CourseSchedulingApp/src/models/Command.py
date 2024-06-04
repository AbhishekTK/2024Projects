from typing import List
import os,sys
current_dir = os.path.abspath(os.path.dirname(__file__))
parent_dir = os.path.abspath(os.path.join(current_dir, ".."))
grandparent_dir = os.path.abspath(os.path.join(current_dir, "..", ".."))
sys.path.append(parent_dir)
sys.path.append(grandparent_dir)
from enums.Commands import Commands

class Command:
    def __init__(self, command:Commands, commandParams: List[str] )->None:
        self.command = command
        self.commandParams = commandParams
