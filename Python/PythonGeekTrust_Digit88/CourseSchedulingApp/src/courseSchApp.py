import sys

from concrete.CourseAllocator import CourseAllocator
from exceptions.InvalidInputError import InvalidInputError
from service.FileService import FileService
class FilePathReader:
    def __init__(self):
        self.file_path = None

    def read_file_path(self):
        try:
            if len(sys.argv) < 2:
                raise ValueError("Please provide the file path as a command-line argument.")
            self.file_path = sys.argv[1]
            print("File path provided:", self.file_path)
            inputFile = open(self.file_path,"r")
            c :CourseAllocator = CourseAllocator(); 
            for inputLine in inputFile:
                # print(inputLine.rstrip("\n"))
                command = FileService.get_command_from_file(inputLine.rstrip("\n"))
                # print(command)
                c.fulfillCommand(command)
            inputFile.close()
            

        except ValueError as e:
            print("An ValueError occurred:", e)
            sys.exit(1)
        except InvalidInputError as e:
            print("An InvalidInputError occurred:", e)
            sys.exit(1)
        except Exception as e:
            print("An Exception occurred:", e)
            sys.exit(1)
        

if __name__ == "__main__":
    reader = FilePathReader()
    reader.read_file_path()

