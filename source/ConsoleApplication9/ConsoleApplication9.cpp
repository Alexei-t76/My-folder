#include <iostream>
#include <cstdlib>
using namespace std;

int main()
{
    system("chcp 1251");

    float distance = 0;
    float consumption = 0;
    float gasoline80_price = 0;
    float gasoline92_price = 0;
    float gasoline95_price = 0;
    float price80 = 0;
    float price92 = 0;
    float price95 = 0;

    cout << "\n";

    cout << "\t\t\tЗадание 9.\n\n";

    cout << "\tвведите расстояние до пункта назначения в км.: ";
    cin >> distance;
    cout << "\tвведите расход  бензина  на  100  км. в литрах: ";
    cin >> consumption;
    cout << "\tвведите стоимость 80, 92 и 95 бензина за 1 литр в рублях, через пробел: ";
    cin >> gasoline80_price >> gasoline92_price >> gasoline95_price;

    price80 = distance / consumption * gasoline80_price;
    price92 = distance / consumption * gasoline92_price;
    price95 = distance / consumption * gasoline95_price;

    cout << "\n";
    cout << "\t| бензин А 80  | стоимость поездки " << price80 << " руб. |\n";
    cout << "\t| бензин АИ 92 | стоимость поездки " << price92 << " руб. |\n";
    cout << "\t| бензин АИ 95 | стоимость поездки " << price95 << " руб. |\n\n";

    return 0;
}