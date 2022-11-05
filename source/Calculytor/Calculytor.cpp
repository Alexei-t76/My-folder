#include <iostream>
#include <cstdlib>

using namespace std;

int main()
{
    system("chcp 1251");

	int i = 0;
	do
	{
		double num1, num2, rez;
		char op;

		cout << endl;
		cout << "\tВведите первое число, оператор и второе число через пробел: ";
		cin >> num1 >> op >> num2;
		cout << endl;
		
		switch (op)
		{
		case '+': rez = num1 + num2;
			cout << "\t" << num1 << " " << op << " " << num2 << " = " << rez << endl;
			cout << endl;
			cout << "\tЕсли хотите продолжить, введите 1, если нет, введите любую другую цифру: ";
			cin >> i;
			break;
		case '-': rez = num1 - num2;
			cout << "\t" << num1 << " " << op << " " << num2 << " = " << rez << endl;
			cout << endl;
			cout << "\tЕсли хотите продолжить, введите 1, если нет, введите любую другую цифру: ";
			cin >> i;
			break;
		case '*': rez = num1 * num2;
			cout << "\t" << num1 << " " << op << " " << num2 << " = " << rez << endl;
			cout << endl;
			cout << "\tЕсли хотите продолжить, введите 1, если нет, введите любую другую цифру: ";
			cin >> i;
			break;
		case '/': rez = num1 / num2;
			cout << "\t" << num1 << " " << op << " " << num2 << " = " << rez << endl;
			cout << endl;
			cout << "\tЕсли хотите продолжить, введите 1, если нет, введите любую другую цифру: ";
			cin >> i;
			break;
		default: 
			cout << "\tНе допустимый оператор!" << endl;
			cout << endl;
			cout << "\tЕсли хотите продолжить, введите 1, если нет, введите любую другую цифру: ";
			cin >> i;
		}

	} while (i == 1);

	cout << endl;
	cout << "\tПока!" << endl;

    return 0;
}