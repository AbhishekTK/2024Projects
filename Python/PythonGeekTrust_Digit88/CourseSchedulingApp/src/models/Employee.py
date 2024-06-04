from exceptions.InvalidInputError import InvalidInputError
import re 
import sys

class Employee:
    def __init__(self,email:str) -> None:
        email_pattern = r'\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\.[A-Z|a-z]{2,}\b'
        # try:
        if re.fullmatch(email_pattern, email) is not None:
            self.email = email
            self.name = email[:email.find('@')]
        else:
            raise InvalidInputError("Invalid email Id of employee")                
        # except InvalidInputError as e:
        #     print("An error occurred:", e)
        #     sys.exit(1)