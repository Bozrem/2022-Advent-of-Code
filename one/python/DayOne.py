import string

class Elf():
    total = 0

    def __init__(self):
        self.total = 1

    def addToTotal(self, calories):
        self.total += calories

testElf = Elf()
topCalorie = 0
with open('C:\\Users\\12315\\VSCode Projects\\2022-Advent-of-Code\\one\\AOC2022_Day_1_Input.txt', 'r') as file:
    for line in file:
        if not line.strip():
            print(testElf.total)
            if testElf.total > topCalorie:
                topCalorie = testElf.total
            testElf = Elf()
        else:
            # Ensure that the line is not blank before converting to int
            if line.strip():
                testElf.addToTotal(int(float(line)))

print(topCalorie)
    
