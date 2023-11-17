#include <iostream>
#include <string>
#include<bits/stdc++.h> 
using namespace std;

class Elf{
    private:
        int total;

    public:
        Elf(){
            total = 0;
        }
        void addCalories(int calories){
            total += calories;
        }
        int getTotal(){
            return total;
        }
};

int main() {
    ifstream in("C:\\Users\\12315\\VSCode Projects\\2022-Advent-of-Code\\one\\AOC2022_Day_1_Input.txt");
    std::string line;
    Elf firstElf = Elf();
    int topCalorie = 0;
    while (getline(in, line)) {
        cout << line << endl;
        if (line.empty()){
            topCalorie = (topCalorie < firstElf.getTotal()) ? firstElf.getTotal() : topCalorie;
            firstElf = Elf();
        }
        else {
            firstElf.addCalories(stoi(line));
        }
    }
    cout << topCalorie << endl;
    return 0;
}