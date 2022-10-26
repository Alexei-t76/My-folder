#include <iostream>
using namespace std;

int main()
{
    float R1 = 2, R2 = 4, R3 = 8, R0;
    R0 = 1 / (1 / R1 + 1 / R2 + 1 / R3);
    // вывод результата.
    cout << "\n";
    cout << "\tR0 = " << R0 << "\n";

    return 0;
}