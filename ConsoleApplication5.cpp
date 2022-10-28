#include <iostream>
#include <cstdlib>
using namespace std;

int main()
{
    system("chcp 1251");
    
    cout << "\n";

    cout << "\t\t\tЗадание 4.\n\n";

    float R1 = 2, R2 = 4, R3 = 8, R0;               // объявляем и иницилизируем переменные
    R0 = 1 / (1 / R1 + 1 / R2 + 1 / R3);            // вычисляем значение R0
    // вывод результата.
    cout << "\n";
    cout << "\tR0 = " << R0 << "\n\n";

    return 0;
}