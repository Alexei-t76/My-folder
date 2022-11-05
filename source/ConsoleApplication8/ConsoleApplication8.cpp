#include <iostream>
#include <cstdlib>
using namespace std;

int main()
{
    system("chcp 1251");

    float h = 0, m = 0, s = 0, m_prise = 0.3, prise = 0;

    cout << "\n";

    cout << "\t\t\tЗадание 8.\n\n";

    cout << "\tвведите время разговора в формате час. мин. сек. через пробел: ";
    cin >> h >> m >> s;
    prise = (h + m / 60 + s / 60 / 60) * 0.3 * 60;

    cout << "\tстоимость Вашего разговора = " << prise << " руб.\n\n";

    return 0;
}