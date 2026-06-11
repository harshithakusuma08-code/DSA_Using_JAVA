#input() function is used to take input from the user. It reads a line from input, converts it into a string (stripping a trailing newline), and returns that. The print() function is used to display the output to the user.
def printNumber(x):
        print(x)
x=input()
printNumber(x)
#if-elif-else statement is used to execute a block of code among multiple options based on the condition provided. It allows you to check multiple conditions and execute different blocks of code accordingly.
class Solution:
    def studentGrade(self, marks):
        if marks >= 90 :
            print("Grade A")
        elif marks >=70 :
            print("Grade B")
        elif marks >=50 :
            print("Grade C")
        elif marks >=35 :
            print("Grade D")
        else:
            print("Fail")
if __name__ == "__main__":
    marks=int(input())
    s=Solution()
    s.studentGrade(marks)
#switch-case statement is a control flow statement that allows you to execute different blocks of code based on the value of a variable or expression. It is often used as an alternative to multiple if-elif-else statements when you have a large number of conditions to check.
class Solution:
    def whichWeekDay(self, day):
        match (day):
            case(1):
                print("Monday")
            case(2):
                print("Tuesday")
            case(3):
                print("Wednesday")
            case(4):
                print("Thursday")
            case(5):
                print("Friday")
            case(6):
                print("Saturday")
            case 7 :
                print("Sunday")
            case _ :
                print("Invalid")
if __name__ == "__main__":
    day=int(input())
    s=Solution()
    s.whichWeekDay(day)