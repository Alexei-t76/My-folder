#include <iostream>
#include <cstdlib>
using namespace std;

int main()
{
    system("chcp 1251");

    float s, t, v;
    
    cout << "\n";
    cout << "\tведите расстояние до аэропорта(км.): ";
    cin >> s;
    cout << "\tведите время, за которое Вам нужно доехать(ч.): ";
    cin >> t;

    v = s / t;

    cout << "\tВаша скорость должна быть не менее " << v << " км/ч.\n\n";
    
    return 0;
}