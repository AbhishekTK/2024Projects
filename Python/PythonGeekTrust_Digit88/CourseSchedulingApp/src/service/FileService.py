import sys, os
current_dir = os.path.abspath(os.path.dirname(__file__))
parent_dir = os.path.abspath(os.path.join(current_dir, ".."))
grandparent_dir = os.path.abspath(os.path.join(current_dir, "..", ".."))
sys.path.append(parent_dir)
sys.path.append(grandparent_dir)
from models.Command import Command
from enums.Commands import Commands
from constants.Constants import Constants
from exceptions.InvalidInputError import InvalidInputError



class FileService:
    def __init__(self) -> None:
        # self.inputLine = ""
        pass    
    
    def get_command_from_file( inputLine)-> Command:
        try:
            return CommandService.extract_command(inputLine)
        except InvalidInputError as e:
            print("An InvalidInputError occurred:", e)
            sys.exit(1)

class CommandService:
    @staticmethod
    def extract_command(text:str) -> Command:
        commandWithArgs = text.split(" ");
        c = Commands[(Constants.getValue(commandWithArgs[0]))];
        params = commandWithArgs[1:]
        command = Command(c, params)
        return command

