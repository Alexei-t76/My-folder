#include <iostream>
#include <cstdlib>
using namespace std;

int main()
{
    system("chcp 1251");

    const float pi = 3.14;                              // объявляем и инициализируем константу pi
    float S, L, R;                                      // объявляем пкркменные
    
    cout << "\n";                                      //  пустая строка

    cout << "\t\t\tЗадание 5.\n\n";

    cout << "\tВведите длинну окружности: ";
    cin >> L;                                           // вводим длинну окружности с клавиатуры
    R = L / (2*pi);                                     // вычисляем радиус
    S = pi * R * R;                                     // вычисляем площадь круга
    cout << "\tПлощадь круга = " << S << "\n\n";        // выводим результат
    
    return 0;
}