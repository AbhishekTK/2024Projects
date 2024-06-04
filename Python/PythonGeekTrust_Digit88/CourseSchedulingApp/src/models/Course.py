from typing import List
from datetime import datetime

from models.Employee import Employee

class Course:
    def __init__(self, courseId:str,courseName:str, instructor:str, date: datetime , minCapacity:int, maxCapacity:int, isAllotted:bool,isCancelled: bool )-> None:
        self.courseID = courseId;
        self.courseName = courseName;
        self.instructor = instructor;
        self.date = date;
        self.minCapacity = minCapacity;
        self.maxCapacity = maxCapacity;
        self.isAllotted = isAllotted;
        self.isCancelled = isCancelled;
        self.registeredEmployees:dict = {};

    # def __str__(self):
    #     return f"User(username='{self.username}', email='{self.email}')"

    def addEmp(self, emp : Employee):
        registrationID = "REG-COURSE-"+emp.name+"-"+self.courseName.strip();
        registrationID.strip();
        self.registeredEmployees.setdefault(registrationID,emp)
        return registrationID
    
    def __eq__(self, other):
        return self.username == other.username

    def __lt__(self, other):
        return self.username < other.username