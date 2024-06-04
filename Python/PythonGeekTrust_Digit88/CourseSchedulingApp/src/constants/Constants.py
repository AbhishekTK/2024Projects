class Constants:
    REJECTED = "REJECTED";
    ACCEPTED = "ACCEPTED";
    CANCEL_REJECTED = "CANCEL_REJECTED";
    CANCEL_ACCEPTED = "CANCEL_ACCEPTED";
    PATTERN = r'^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$'
    def getValue ( ip: str) -> str:
        val = ""
        if ip == "ADD-COURSE-OFFERING":
            val = "ADD_COURSE_OFFERING";
        elif ip == "ALLOT-COURSE":
            val = "ALLOT_COURSE";
        else:
            val = ip;
        return val;

